package todo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import todo.domain.RequestTodo;
import todo.domain.TodoDTO;

public class TodoDAO2 {

    private static final TodoDAO2 INSTANCE = new TodoDAO2();

    private TodoDAO2() {}

    public static TodoDAO2 getInstance() {
        return INSTANCE;
    }

    public List<TodoDTO> selectByAll(Connection conn) {
        String sql = "SELECT * FROM tbl_todo;";
        try (PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            List<TodoDTO> list = new ArrayList<>();
            while (rs.next()) {
                list.add(makeTodoDTO(rs));
            }
            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private TodoDTO makeTodoDTO(ResultSet rs) throws SQLException {
        return new TodoDTO(rs.getInt("tno"), rs.getString("todo"), rs.getString("duedate"), rs.getBoolean("finished"));
    }

    public int insertTodo(Connection conn, RequestTodo todo) {
        String sql = "INSERT INTO tbl_todo (todo, duedate) VALUES(?,?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, todo.getTodo());
            pstmt.setString(2, todo.getDuedate());
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public TodoDTO selectByTno(Connection conn, int tno) {
        String sql = "SELECT * FROM tbl_todo WHERE tno = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, tno);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return makeTodoDTO(rs);
                }
                return null;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int updateByTno(Connection conn, TodoDTO todo) {
        String sql = "UPDATE tbl_todo SET todo = ?, duedate = ?, finished = ? WHERE tno = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, todo.getTodo());
            pstmt.setString(2, todo.getDuedate());
            pstmt.setBoolean(3, todo.isFinished());
            pstmt.setInt(4, todo.getTno());
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int deleteByTno(Connection conn, int tno) {
        String sql = "DELETE FROM tbl_todo WHERE tno = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, tno);
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
