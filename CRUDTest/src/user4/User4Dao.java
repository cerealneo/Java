package user4;
/*
 * DAO 클래스
 *  - Data Access Object 
 *  - 데이터베이스 테이블 CRUD 처리 객체
 */

import java.sql.*;
import java.util.*;

public class User4Dao {
	// 싱글톤
	private static User4Dao instance = new User4Dao();

	public static User4Dao getInstance() {
		return instance;
	}

	private User4Dao() {
	}

	// DB정보
	private final String HOST = "jdbc:mysql://localhost:3306/studydb";
	private final String USER = "root";
	private final String PASS = "1234";

	// 커넥션
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(HOST, USER, PASS);
	}

	// 리소스
	private Connection conn = null;
	private Statement stmt = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;

	// 기본 CRUD 메서드
	public void insertUser4(User4 user) {

		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_USER4);
			psmt.setString(1, user.getUid());
			psmt.setString(2, user.getName());
			psmt.setString(3, user.getGender());
			psmt.setInt(4, user.getAge());
			psmt.setString(5, user.getHp());
			psmt.setString(6, user.getAddr());
			psmt.executeUpdate();
			closeAll();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public User4 selectUser4(String uid) {

		User4 user = null;

		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_USER4);
			psmt.setString(1, uid);

			rs = psmt.executeQuery();

			// SELECT의 결과가 0 또는 1이기 때문에 while 대신 if문으로 결과 처리
			if (rs.next()) {
				user = new User4();
				user.setUid(rs.getString(1));
				user.setName(rs.getString(2));
				user.setGender(rs.getString(3));
				user.setAge(rs.getInt(4));
				user.setHp(rs.getString(5));
				user.setAddr(rs.getString(6));
			}
			closeAll();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	public List<User4> selectUser4List() {

		List<User4> list = new ArrayList<>();

		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SQL.SELECT_USER4_LIST);

			while (rs.next()) {
				User4 user = new User4();
				user.setUid(rs.getString(1));
				user.setName(rs.getString(2));
				user.setGender(rs.getString(3));
				user.setAge(rs.getInt(4));
				user.setHp(rs.getString(5));
				user.setAddr(rs.getString(6));
				list.add(user);
			}
			closeAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public void updateUser4(User4 user) {
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.UPDATE_USER4);
			psmt.setString(1, user.getName());
			psmt.setString(2, user.getGender());
			psmt.setInt(3, user.getAge());
			psmt.setString(4, user.getHp());
			psmt.setString(5, user.getAddr());
			psmt.setString(6, user.getUid());
			psmt.executeUpdate();
			closeAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteUser4(String uid) {
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.DELETE_USER4);
			psmt.setString(1, uid);
			psmt.executeUpdate();
			closeAll();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 통합 close(자원해제) 메서드
	public void closeAll() throws SQLException {

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
