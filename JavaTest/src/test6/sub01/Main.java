package test6.sub01;
/*
 * 날짜 : 2025/01/27
 * 이름 : 이민성
 * 내용 : 자바 총정리 연습문제
*/
public class Main {

	public static void main(String[] args) {
		StudentScore student = new StudentScore("홍길동","S001","자바",90.0);
		
		student.printStudentInfo();
		System.out.println("---------------------");
		
		student.updateScore(98.0);
		System.out.println("---------------------");
		
		student.updateScore(102.0);
		System.out.println("---------------------");
		
		student.printStudentInfo();
		System.out.println("---------------------");
		

	}

}
