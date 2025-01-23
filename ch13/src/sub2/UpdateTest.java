package sub2;

import java.sql.*;

/*
 *  날짜 : 2025/01/23
 *  이름 : 이민성
 *  내용 : java CRUD 실습하기
*/
public class UpdateTest {

	public static void main(String[] args) {
		//DB정보
		final String HOST = "jdbc:mysql://127.0.0.1:3306/studydb";
		final String USER = "root";
		final String PASS = "1234";
		
		try {
			// 1단계 - 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			// 3단계 - SQL실행 객체 생성
			Statement stmt = conn.createStatement();
			// 4단계 - SQL 실행
			String sql = "UPDATE `user1` SET `name` = '김유신',`hp`='010-1234-1011' "+ "WHERE `uid`='j101' ";
			stmt.executeUpdate(sql);
			// 5단계 - 조회 결과처리(Select 경우)
			// 6단계 - 데이터베이스 종료(자원해제)
			stmt.close();
			conn.close();
					
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("update 완료");

	}

}
