package sub3;

import java.sql.*;
import java.util.*;

import sub2.User1;

/*
 *  날짜 : 2025/01/23
 *  이름 : 이민성
 *  내용 : java CRUD 실습하기
*/
public class PreparedSelectTest {

	public static void main(String[] args) {
		// db 정보
		final String HOST = "jdbc:mysql://127.0.0.1:3306/studydb";
		final String USER = "root";
		final String PASS = "1234";
		
		List<User1> users = new ArrayList<User1>();

		try {
			// 1단계 JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2단계 데이터베이스 접속
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);

			// 3단계
			String sql = "SELECT * FROM `user1` ";
			PreparedStatement psmt = conn.prepareStatement(sql);

			// 4단계
			ResultSet rs = psmt.executeQuery();

			// 5단계
			while (rs.next()) {
				User1 user1 = new User1();
				user1.setUid(rs.getString(1));
				user1.setName(rs.getString(2));
				user1.setBirth(rs.getString(3));
				user1.setHp(rs.getString(4));
				user1.setAge(rs.getInt(5));

				users.add(user1);
			}
			// 6단계
			psmt.close();
			conn.close();
			rs.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		for (User1 user1 : users) {
			System.out.println(user1);
		}
		System.out.println("Select 완료...");
	}
}
