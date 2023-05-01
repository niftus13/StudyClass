package todo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Service : Dao 메소드에 매개변수로 전달
public class ConnectionProvider {

	public static Connection getConnection() throws SQLException {
		// DB URL
		String dbUrl = "jdbc:mysql://localhost:3306/project";
		
		return DriverManager.getConnection(dbUrl, "himedia","tiger");

	}
}
