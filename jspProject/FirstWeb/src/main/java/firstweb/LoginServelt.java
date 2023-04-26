package firstweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/auth/login") // localhost:8080 /web/auth/login
public class LoginServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// post
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response)
			throws ServletException, IOException {

		//////////////////////////
		// 사용자 요청 처리

		String userId = request.getParameter("userid");
		System.out.println("사용자 입력 id : " + userId);

		String password = request.getParameter("userpw");
		System.out.println("사용자 입력 Password : " + password);
		////////////////////////////
		// 응답처리

		PrintWriter out = response.getWriter();

		out.println("id : " + userId);
		out.println("Password : " + password);
		out.close();

	}
	// get
	@Override
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		//////////////////////////
		// 사용자 요청 처리

		String userId = request.getParameter("userid");
		System.out.println("사용자 입력 id : " + userId);

		String password = request.getParameter("userpw");
		System.out.println("사용자 입력 Password : " + password);
		////////////////////////////
		// 응답처리

		PrintWriter out = response.getWriter();

		out.println("id : " + userId);
		out.println("Password : " + password);
		out.close();
	}

}
