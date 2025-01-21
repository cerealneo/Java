package sub1;
/*
 *  날짜 : 2025/01/21
 *  이름 : 이민성
 *  내용 : java 함수형 프로그래밍 실습하기
*/

interface Person{
	public void hello();
}

class Student implements Person{

	@Override
	public void hello() {
		System.out.println("Hello student");
	}
}


public class FunctionalTest {

	public static void main(String[] args) {
		Person student = new Student();
		student.hello();
		
		//익명객체(인터페이스를 직접 객체로 생성)
		Person developer = new Person() {
			public void hello() {
				System.out.println("hello developer");
			}
		};
		developer.hello();
		
		//함수형 프로그래밍
		Person techer = () -> {
			System.out.println("hello. techer");
		};
		
		techer.hello();
		
		
	}

}
