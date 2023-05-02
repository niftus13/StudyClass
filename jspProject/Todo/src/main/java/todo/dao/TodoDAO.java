package todo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import todo.domain.RequestTodo;
import todo.domain.TodoDTO;
import todo.util.ConnectionProvider;

public class TodoDAO {

	// 싱글톤 처리
	// 1. 생성자 private
	private TodoDAO() {

	}

	// 2. 내부에서 TodoDao 인스턴스 생성 -> private static
	private static TodoDAO dao = new TodoDAO();

	// 3. 외부에서 TodoDao의 참조값을 얻을 수 있는 메소드 public static
	public static TodoDAO getInstance() {
		return dao;
	}

	// TodoDTO 리스트를 반환하는 메소드 => list select*(list)
	public List<TodoDTO> selectByAll(Connection conn) {

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<TodoDTO> list = null;

		// SQL
		String sql = "SELECT * FROM tbl_todo;";

		// PreparedStatement
		try {
			pstmt = conn.prepareStatement(sql);
			// set XXX

			// 결과 받기
			// ResultSet
			rs = pstmt.executeQuery();
			list = new ArrayList<TodoDTO>();

			// List<TodoDTO> 에 저장 반환
			while (rs.next()) {
//				int tno = rs.getInt("tno");
//				String todo = rs.getString("todo");
//				String duedate = rs.getString("duedate"); // 2023-05-05
//				boolean finished = rs.getBoolean("finished");
//
//				TodoDTO dto = new TodoDTO(tno, todo, duedate, finished);
				list.add(makeTodoDTO(rs));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	// rs -> TodoDTO생성 반환
	private TodoDTO makeTodoDTO(ResultSet rs) throws SQLException {

		return new TodoDTO(rs.getInt("tno"), rs.getString("todo"), rs.getString("duedate"), rs.getBoolean("finished"));
	}

	// RequestTodo 데이터를 받아서 Insert 처리 (입력)
	public int insertTodo(Connection conn, RequestTodo todo) {

		PreparedStatement pstmt = null;
		int result = 0;

		// insert sql
		String sql = "INSERT INTO tbl_todo (todo, duedate) VALUES(?,?)";

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, todo.getTodo());
			pstmt.setString(2, todo.getDuedate());

			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return result;
	}

	// tno 값을 받아서 해당 tno 정보(TodoDTO)를 반환하는 메소드 (상세보기)

	public TodoDTO selectByTno(Connection conn, int tno) {

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		TodoDTO todo = null;

		// sql
		String sql = "select * from tbl_todo where tno = ?";

		try {
			pstmt = conn.prepareStatement(sql);
			// set
			pstmt.setInt(1, tno);

			// rs
			rs = pstmt.executeQuery();

			// if : 결과 행이 0 또는 1 일때
			if (rs.next()) {
//				todo = new TodoDTO(rs.getInt("tno"), 
//						rs.getString("todo"), 
//						rs.getString("duedate"),
//						rs.getBoolean("finished"));
				makeTodoDTO(rs);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return todo;
	}

	// TodoDTO 값을 받고
	// update
	public int updateByTno(Connection conn, TodoDTO todo) {

		PreparedStatement pstmt = null;
		int result = 0;

		// sql
		String sql = "UPDATE tbl_todo SET TODO=?, DUEDATE=?, finished = ?  WHERE TNO=?;";

		try {
			pstmt = conn.prepareStatement(sql);
			// set
			pstmt.setString(1, todo.getTodo());
			pstmt.setString(2, todo.getDuedate());
			pstmt.setBoolean(3, todo.isFinished());
			pstmt.setInt(4, todo.getTno());

			// result
			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return result;
	}

	// tno 전달받아
	// DELETE
	public int deleteByTno(Connection conn, int tno) {

		PreparedStatement pstmt = null;
		int result = 0;

		// sql
		String sql = "DELETE FROM tbl_todo WHERE TNO = ?";

		try {
			pstmt = conn.prepareStatement(sql);
			// set
			pstmt.setInt(1, tno);

			// result
			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return result;

	}

	// DAO TEST
	public static void main(String[] args) throws SQLException {
		TodoDAO dao = TodoDAO.getInstance();
		Connection conn = ConnectionProvider.getConnection();

		// list test
//		List<TodoDTO> list = dao.selectByAll(conn);
//		for (TodoDTO todo : list) {
//			System.out.println(todo);
//		}
		// insert test
//		dao.insertTodo(conn, new RequestTodo("회의", "2023-05-05"));
//		System.out.println("입력완료...");

		// selectbytno test
//		TodoDTO todo = dao.selectByTno(conn, 2);
//		System.out.println(todo);

		// update test
//		dao.updateByTno(conn, new TodoDTO(1, "청소 후 휴식", "2023-05-03", true));
//		System.out.println("수정완료");

		// delete test
//		dao.deleteByTno(conn, 9);

		conn.close();
	}
}
