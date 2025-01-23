package sub2;

import java.sql.*;

/*
 *  날짜 : 2025/01/23
 *  이름 : 이민성
 *  내용 : java CRUD 실습하기
*/
public class UpdateTest {

	public static void main(String[] args) {
		final String HOST = "jdbc:mysql://127.0.0.1:3306/studydb";
		final String USER = "root";
		final String PASS = "1234";
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			Statement stmt = conn.createStatement();
			
			String sql = "UPDATE `user1` SET `name` = '김유신',`hp`='010-1234-1011' "+ "WHERE `uid`='j101' ";
			stmt.executeUpdate(sql);
			
			stmt.close();
			conn.close();
					
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("update 완료");

	}

}
