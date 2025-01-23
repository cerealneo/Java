package sub3;

import java.sql.*;

/*
 *  날짜 : 2025/01/23
 *  이름 : 이민성
 *  내용 : java CRUD 실습하기
*/
public class PreparedUpdateTest {

	public static void main(String[] args) {

		// db 정보
		final String HOST = "jdbc:mysql://127.0.0.1:3306/studydb";
		final String USER = "root";
		final String PASS = "1234";

		try {
			// 1단계 JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2단계 데이터베이스 접속
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			//3단계
			String sql = "UPDATE `user1` SET `name`=?,`hp`=?, `age`=? ";
				sql += "WHERE `uid`=?";

			
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "김유신");
			psmt.setString(2, "010-1234-1022");
			psmt.setInt(3, 21);
			psmt.setString(4, "j101");
			System.out.println(psmt);
			
			//4단계
			psmt.executeUpdate();
			
			//5단계
			
			//6단계
			psmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("update 완료");
	}

}
