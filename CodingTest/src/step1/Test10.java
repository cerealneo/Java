package step1;
/*
 *  날짜 : 2025/01/03
 *  이름 : 이민성
 *  내용 : 백준 코딩테스트 1단계 10 곱셈
 */

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		 int ones = b % 10;
		 int tens = (b / 10) % 10;
		 int hundreds = b / 100;
		 
		 int firstLine = a * ones;
	     int secondLine = a * tens;
	     int thirdLine = a * hundreds;
	     int finalResult = a * b;
		
		
		System.out.println(firstLine);
		System.out.println(secondLine);
		System.out.println(thirdLine);
		System.out.println(finalResult);
	}
}
