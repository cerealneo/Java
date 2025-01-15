package sub7;
/*
 *  날짜 : 2025/01/09
 *  이름 : 이민성
 *  내용 : java 추상클래스 실습하기
 */
public class AbstractTest {
	public static void main(String[] args) {
		
		
		//추상클래스는 객체생성 X
		
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		Animal a3 = new Shark();

		a1.move();
		a2.move();
		a3.move();
	}
}
