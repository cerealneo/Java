package sub1;

import java.sql.*;

/*
 *  날짜 : 2025/01/23
 *  이름 : 이민성
 *  내용 : java JDBC 접속 테스트 실습하기
 *  
 *  JDBC
 *   - 자바 데이터베이스 커넥션
 *   - 자바 기술로 데이터베이스를 연결하기 위한 기술 표준
*/
public class JDBCTest {

	public static void main(String[] args) {
		
		//db 정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "root";
		String pass = "1234";
		
		try {
			//1단계 jdbc 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2단계 데이터 베이스 접속
			Connection conn = DriverManager.getConnection(host, user,pass);
			
			if(conn != null) {
				System.out.println("데이터베이스 접속 성공");
			}else {
				System.out.println("데이터베이스 접속 실패");
			}
			//데이터베이스 종료
			conn.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
