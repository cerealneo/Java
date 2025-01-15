package ch03.sec01;
//교재 p80 실습하기
public class SignOperatorExample {
	public static void main(String[] args) {
		int x = -100;
		x=-x;
		System.out.println("x: "+x);
		
		byte b = 100;
		int y = -b;
		System.out.println("y: "+y);
	}
}
