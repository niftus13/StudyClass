package member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")
public class LoginController extends HttpServlet {
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("LoginController.... doGet()...");
		
		request.getRequestDispatcher("/WEB-INF/views/member/loginForm.jsp").forward(request, response);
	
	
	}
	
	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("LoginController.... doPost()...");
		//사용자가 입력한 ID/PW 받아서 인증처리
		String mid = request.getParameter("mid");
		String pw = request.getParameter("pw");
		String reid = request.getParameter("reid");
		
		System.out.println("reid = "+ reid);
		
		// 현재 세션 정보 획득
		HttpSession session = request.getSession();
		
		// 인증처리 : ID PW가 같은 문자열일때 인증완료 처리
		if(mid.equals(pw)) {
			// 회원 -> HttpSession 객체에 회원 정보를 저장
			// 저장된 회원정보는 회원이 로그인 했다는 판단 기준으로 사용
			session.setAttribute("loginInfo", mid);
			
			//reid 값이 on이면 쿠키 저장
			if(reid != null && reid.equals("on")) {
				Cookie cookie = new Cookie("reid", mid);
				cookie.setMaxAge(60*60*24*30);
				cookie.setPath("/");
				response.addCookie(cookie);
			}else {
				//cookie 지우기
				Cookie cookie = new Cookie("reid", "aa");
				cookie.setMaxAge(0);
				cookie.setPath("/");
				response.addCookie(cookie);
			}
			
			response.sendRedirect("/app/index.jsp");
//			return ;
			
		}else {
			System.out.println("인증 실패");
			response.sendRedirect("/app/login");
		}
		
	
	}

}
