package sub4;

import java.sql.*;
import java.util.*;

/*
 *  날짜 : 2025/01/23
 *  이름 : 이민성
 *  내용 : java 트랜잭션 실습하기
*/
public class TransactionTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("에러를 발생하시겠습니까?");
		
		int answer = sc.nextInt();
		
		//db정보
		final String HOST = "jdbc:mysql://127.0.0.1:3306/bank";
		final String USER = "root";
		final String PASS = "1234";
		
		Connection conn = null;
		
		try {
			
			//1단계 
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			//2단계
			conn = DriverManager.getConnection(HOST, USER, PASS);
			
			//트랜젝션 자동커밋 해제
			conn.setAutoCommit(false);
			
			//3단계
			String sql1 = "update `bank_account` set `a_balance` = `a_balance` - 10000 where `a_no`=?";
			String sql2 = "update `bank_account` set `a_balance` = `a_balance` + 10000 where `a_no`=?";
			
			PreparedStatement psmt1 = conn.prepareStatement(sql1);
			psmt1.setString(1, "101-11-1001");
			
			PreparedStatement psmt2 = conn.prepareStatement(sql2);
			psmt2.setString(1, "101-11-1003");
			
			//4단계
			psmt1.executeUpdate();
			
			if(answer ==1) {
				throw new Exception("예기치 않은에러가 발생하였습니다.");
			}
			
			psmt2.executeUpdate();
			
			//작업 확정(데이터베이스 작업 반영)
			conn.commit();
			
			//5단계
			//6단계
			psmt1.close();
			psmt2.close();
			conn.close();
			
		}catch (Exception e) {
			e.printStackTrace();
			
			try {
				// 작업 취소(데이터베이스 SQL 실행전으로 돌아가기)
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
		}
		System.out.println("트랜잭션 실습 완료...");
	}

}
