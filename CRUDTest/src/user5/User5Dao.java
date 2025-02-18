package user5;
/*
 * DAO 클래스
 *  - Data Access Object 
 *  - 데이터베이스 테이블 CRUD 처리 객체
 */

import java.sql.*;
import java.util.*;

public class User5Dao {
	// 싱글톤
	private static User5Dao instance = new User5Dao();

	public static User5Dao getInstance() {
		return instance;
	}

	private User5Dao() {
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
	public void insertUser5(User5 user) {

		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_USER5);
			psmt.setString(1, user.getName());
			psmt.setString(2, user.getGender());
			psmt.setInt(3, user.getAge());
			psmt.setString(4, user.getAddr());
			psmt.executeUpdate();
			closeAll();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public User5 selectUser5(int seq) {

		User5 user = null;

		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_USER5);
			psmt.setInt(1, seq);

			rs = psmt.executeQuery();

			// SELECT의 결과가 0 또는 1이기 때문에 while 대신 if문으로 결과 처리
			if (rs.next()) {
				user = new User5();
				user.setSeq(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setGender(rs.getString(3));
				user.setAge(rs.getInt(4));
				user.setAddr(rs.getString(5));
			}
			closeAll();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	public List<User5> selectUser5List() {

		List<User5> list = new ArrayList<>();

		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SQL.SELECT_USER5_LIST);

			while (rs.next()) {
				User5 user = new User5();
				user.setSeq(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setGender(rs.getString(3));
				user.setAge(rs.getInt(4));
				user.setAddr(rs.getString(5));
				list.add(user);
			}
			closeAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public void updateUser5(User5 user) {
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.UPDATE_USER5);
			psmt.setString(1, user.getName());
			psmt.setString(2, user.getGender());
			psmt.setInt(3, user.getAge());
			psmt.setString(4, user.getAddr());
			psmt.setInt(5,user.getSeq());
			psmt.executeUpdate();
			closeAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteUser5(int seq) {
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.DELETE_USER5);
			psmt.setInt(1, seq);
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
