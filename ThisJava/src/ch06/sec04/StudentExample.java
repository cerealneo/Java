package ch06.sec04;
//교재 p212 실습하기
public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		System.out.println("s2변수가 또 다른 student 객체를 참조합니다.");
	}
}
