package db;

import java.sql.*;

public class DBHelper {

	// db정보
	private final String HOST = "jdbc:mysql://localhost:3306/shop";
	private final String USER = "shop";
	private final String PASS = "1234";

	// db리소스
	protected Connection conn = null;
	protected PreparedStatement psmt = null;
	protected Statement stmt = null;
	protected ResultSet rs = null;
	
	//커넥션
	protected Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(HOST, USER, PASS);
	}
	
	//자원해제
	protected void closeAll() throws SQLException {

		if (rs != null) {
			rs.close();
		}

		if (stmt != null) {
			stmt.close();
		}

		if (psmt != null) {
			psmt.close();
		}

		if (conn != null) {
			conn.close();
		}
	}
}
