package firstweb.form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class inputServlet
 */
@WebServlet("/form/input")
public class inputServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 사용자 요청 한글처리
		request.setCharacterEncoding("UTF-8");

		// 내용 입력데이터 받기
		// textarea
		String content = request.getParameter("content");
		System.out.println("content : " + content);
		// gender
		String gender = request.getParameter("gender");
		System.out.println("gender : " + gender);
		// checkbox
		String[] langs = request.getParameterValues("lang");
		System.out.println("관심사");

		for (String lang : langs) {
			System.out.println(lang);
		}
		// select
		String birthYear = request.getParameter("birthyear");
		System.out.println("태어난 년도 :" + birthYear);

		// number
		String paramAge = request.getParameter("age");
		int age = Integer.parseInt(paramAge);

		if (age > 19) {
			// 성인이 접속 가능한 페이지
		} else {
			// 미성년자가 접속가능한 페이지
		}
		System.out.println("나이 : " + age);

		// date
		String birth = request.getParameter("birth");
		System.out.println("birth" + birth);

		// 응답처리
		response.setContentType("text/html; charset=UTF-8");

		PrintWriter out = response.getWriter();
		out.println("<h3>content : " + content + "</h3>");
		out.println("<h3>gender : " + gender + "</h3>");
		out.println("<h3>관심사</h3>");

		for (String lang : langs) {
			out.println(" - " + lang + "<br>");
		}

		out.println("<h3>birthyear : " + birthYear + "</h3>");
		out.println("<h3>birth : " + birthYear + "</h3>");
		out.close();

	}

}
