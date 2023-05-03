package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebFilter( urlPatterns = { "/todo/*" })
public class LoginCheckfilter extends HttpFilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		// 요청에 대한 filter 처리
		System.out.println("LoginCheckFilter... doFilter()...");
		
		// Session 확인
		// 회원의 로그인 확인여부를 확인 후 비 로그인 상태 -> 로그인 페이지로 이동
		HttpSession session = ((HttpServletRequest)request).getSession();

		// 1. session 이 새로운 세션이 아니고 세션에 로그인정보를 가지고 있다면 => 로그인상태
		// 리디렉션 => 로그인 페이지
		// 2. 새로 만들어진 세션 or 세션에 로그인 정보가 없을때
		if (session.isNew() || session.getAttribute("loginInfo") == null) {
			System.out.println("로그인 상태가 아니다");
			// 로그인 페이지로 리디렉션
			((HttpServletResponse)response).sendRedirect("/app/login");

			return;
		}
		
		chain.doFilter(request, response);
		
		//응답에 대한 filter 처리
	}


	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
