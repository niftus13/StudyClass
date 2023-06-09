package todo.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import todo.domain.RequestTodo;
import todo.service.TodoInsertService;

@WebServlet("/todo/register")
public class TodoRegisterController extends HttpServlet {

	TodoInsertService insertService;

	public TodoRegisterController() {
		this.insertService = TodoInsertService.getInstance();
	}

	// get
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// todo 입력폼 화면 출력
		System.out.println("TodoRegisterController.... doGet()..."); // log
		
		
		// 회원의 로그인 확인여부를 확인 후 비 로그인 상태 -> 로그인 페이지로 이동
		HttpSession session = request.getSession();
		
		// 1. session 이 새로운 세션이 아니고 세션에 로그인정보를 가지고 있다면 => 로그인상태
		// 리디렉션 => 로그인 페이지
		// 2. 새로 만들어진 세션 or 세션에 로그인 정보가 없을때 
		if(session.isNew() || session.getAttribute("loginInfo") == null) {
			System.out.println("로그인 상태가 아니다");
			//로그인 페이지로 리디렉션
			response.sendRedirect("/app/login");
			
			return ;
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/todo/registerForm.jsp");
		dispatcher.forward(request, response);
		
	}

	
	
	// post
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("TodoRegisterController... doPost()....");

		// post방식의 데이터 전달 => 파라미터 한글 처리
//		request.setCharacterEncoding("UTF-8");

		// 입력폼에서 전달한 받아서 데이터 처리
		String todo = request.getParameter("todo");
		String duedate = request.getParameter("duedate");
//System.out.println(todo + " : " + duedate);

		RequestTodo requestTodo = new RequestTodo(todo, duedate);

		// Service 요청 처리
		int result = insertService.register(requestTodo);

		if (result > 0) {
			System.out.println("입력 성공...");
		} else {
			System.out.println("입력 실패...");
		}

		// redirect : "list"
		response.sendRedirect("list"); // 외부에서 접속하는 URL

	}

}
