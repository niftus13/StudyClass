package todo.service;

import java.sql.Connection;
import java.sql.SQLException;

import todo.dao.TodoDAO;
import todo.domain.RequestTodo;
import todo.util.ConnectionProvider;

public class TodoInsertService {

	TodoDAO dao;

	// 싱글톤 처리

	private static TodoInsertService service = new TodoInsertService();

	private TodoInsertService() {
		this.dao = TodoDAO.getInstance();
	}

	public static TodoInsertService getInstance() {
		return service;
	}

	// 입력의 요청을 처리하느 메소드
	public int register(RequestTodo todo) {

		Connection conn = null;
		int result = 0;

		try {
			conn = ConnectionProvider.getConnection();
			
			// RequestTodo 전달받고 Doa메소드에 요청
			result = dao.insertTodo(conn, todo);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

		return result;
	}

	

	
	
}
