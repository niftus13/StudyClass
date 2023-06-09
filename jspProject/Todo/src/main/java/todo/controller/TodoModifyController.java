package todo.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import todo.domain.Todo;
import todo.domain.TodoDTO;
import todo.service.TodoUpdateService;
import todo.service.TodoViewService;

@WebServlet("/todo/modify")
public class TodoModifyController extends HttpServlet {

	TodoViewService viewService;
	TodoUpdateService updateService;

	public TodoModifyController() {
		this.viewService = TodoViewService.getInstance();
		this.updateService = TodoUpdateService.getInstance();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("TodoModifyController... doGet()....");

		// Session 확인
		// 회원의 로그인 확인여부를 확인 후 비 로그인 상태 -> 로그인 페이지로 이동
		HttpSession session = request.getSession();

		// 1. session 이 새로운 세션이 아니고 세션에 로그인정보를 가지고 있다면 => 로그인상태
		// 리디렉션 => 로그인 페이지
		// 2. 새로 만들어진 세션 or 세션에 로그인 정보가 없을때
		if (session.isNew() || session.getAttribute("loginInfo") == null) {
			System.out.println("로그인 상태가 아니다");
			// 로그인 페이지로 리디렉션
			response.sendRedirect("/app/login");

			return;
		}

		// 수정 폼 : 이전에 입력했던 데이터가 화면에 출력
		// no 값을 받고
		String noStr = request.getParameter("no");
		int no = Integer.parseInt(noStr); // modify?no = 2
		// no 값에 해당하는 Todo 데이터를 Service를 통해서 받고

		TodoDTO todo = viewService.getTodo(no);

		// request 속성에 결과 데이터 저장
		request.setAttribute("todo", todo);
		// view지정
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/todo/modify.jsp");
		// forward
		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("TodoModifyController... doPost()....");
		// 수정 form에서 전달받은 데이터를 서비스에 요청
//		request.setCharacterEncoding("UTF-8");

		String noStr = request.getParameter("no");
		String todo = request.getParameter("todo");
		String duedate = request.getParameter("duedate");
		String complete = request.getParameter("complete");

		TodoDTO todoDTO = new TodoDTO(Integer.parseInt(noStr), todo, duedate,
				complete != null ? complete.equals("on") ? true : false : false);

//		Todo newtodo = new Todo(
//				Integer.parseInt(noStr), 
//				todo, 
//				duedate, 
//				complete!= null ? complete.equals("on") ? "done": "not" : "not");
//		System.out.println(newtodo);

		// 서비스에 요청 update
		// 결과 받음
		int result = updateService.modify(todoDTO);

		if (result > 0) {
			System.out.println("수정 완료 ...");
		} else {
			System.out.println("수정 실패");
		}

		// redirect 처리
		response.sendRedirect("list");

	}

}
