package user3;
/*
 * DAO 클래스
 *  - Data Access Object 
 *  - 데이터베이스 테이블 CRUD 처리 객체
 */

import java.sql.*;
import java.util.*;

public class User3Dao {
	// 싱글톤
	private static User3Dao instance = new User3Dao();

	public static User3Dao getInstance() {
		return instance;
	}

	private User3Dao() {
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
	public void insertUser3(User3 user) {

		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_USER3);
			psmt.setString(1, user.getUid());
			psmt.setString(2, user.getName());
			psmt.setString(3, user.getBirth());
			psmt.setString(4, user.getHp());
			psmt.setString(5, user.getAddr());
			psmt.executeUpdate();
			closeAll();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public User3 selectUser3(String uid) {

		User3 user = null;

		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_USER3);
			psmt.setString(1, uid);

			rs = psmt.executeQuery();

			// SELECT의 결과가 0 또는 1이기 때문에 while 대신 if문으로 결과 처리
			if (rs.next()) {
				user = new User3();
				user.setUid(rs.getString(1));
				user.setName(rs.getString(2));
				user.setBirth(rs.getString(3));
				user.setHp(rs.getString(4));
				user.setAddr(rs.getString(5));
			}
			closeAll();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	public List<User3> selectUser3List() {

		List<User3> list = new ArrayList<>();

		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SQL.SELECT_USER3_LIST);

			while (rs.next()) {
				User3 user = new User3();
				user.setUid(rs.getString(1));
				user.setName(rs.getString(2));
				user.setBirth(rs.getString(3));
				user.setHp(rs.getString(4));
				user.setAddr(rs.getString(5));
				list.add(user);
			}
			closeAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public void updateUser3(User3 user) {
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.UPDATE_USER3);
			psmt.setString(1, user.getName());
			psmt.setString(2, user.getBirth());
			psmt.setString(3, user.getHp());
			psmt.setString(4, user.getAddr());
			psmt.setString(5, user.getUid());
			psmt.executeUpdate();
			closeAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteUser3(String uid) {
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.DELETE_USER3);
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
