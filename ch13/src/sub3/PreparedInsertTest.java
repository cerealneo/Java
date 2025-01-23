package sub3;

import java.sql.*;

/*
 *  날짜 : 2025/01/23
 *  이름 : 이민성
 *  내용 : java CRUD 실습하기
*/
public class PreparedInsertTest {

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

			// 3단계 SQL 실행 객체 생성
			//쿼리 피라미터 ?를 사용해 쿼리문 작성
			String sql = "INSERT INTO `user1` VALUES (?,?,?,?,?)"; 
			
			//preared 객체생성
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			//쿼리 파라미터 맵핑(사상)
			psmt.setString(1,"j101");
			psmt.setString(2, "홍길동");
			psmt.setString(3, "");
			psmt.setString(4, "010-1234-1001");
			psmt.setInt(5, 23);
			System.out.println(psmt);
			
			// 4단계 SQL 실행
			psmt.executeUpdate();
			

			// 5단계 ResultSet 결과 처리 ( select 경우)

			// 6단계 데이터베이스 종료(자원해제)
			psmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("insert 완료");
	}

}
