package sub1;
/*
 * 날짜 : 2024/12/31
 * 이름 : 이민성
 * 내용 : ch02. 변수와 연산자
 */
public class VariableTest {

	public static void main(String[] args) {
		// 변수
		int a = 3; // 초기화(최초로 변수에 값을 저장)
		int b = 7;
		
		System.out.println("a값 : "+a);
		System.out.println("a값 : "+b);
		
		a=5;
		b=9;
		
		System.out.println("a값 : "+a);
		System.out.println("a값 : "+b);
		
		//상수
		final int NUM = 5;
		// 상수는 최초의 값으로 고정되기 때문에 재할당 할 수 없음
		//NUM = 7;
		
		System.out.println("NUM값 : "+NUM);
	}
}
