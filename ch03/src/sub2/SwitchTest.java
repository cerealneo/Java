package sub2;

import java.util.Scanner;

/*
 *  날짜 : 2025/01/02
 *  이름 : 이민성
 *  내용 : java 조건문 switch 실습하기
 */
public class SwitchTest {
	public static void main(String[] args) {
		
		System.out.print("숫자 입력 : ");
		
		//사용자 입력
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		System.out.println("입력 숫자 : "+number);
		
		//조건의 값의 결과에 따라 case별로 실행흐름 분기
		
		
		switch(number %2) {
		
		case 0:
			System.out.println("number 은 짝수");
			break;
			
		case 1:
			System.out.println("number 은 홀수");
			break;
			
		default:
			System.out.println("number 은 숫자가 아님");
			break;
		
		
		}
	}
}
