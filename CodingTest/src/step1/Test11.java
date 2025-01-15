package step1;
/*
 *  날짜 : 2025/01/03
 *  이름 : 이민성
 *  내용 : 백준 코딩테스트 1단계 11 3수 곱셈
 */

import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long sum =0;
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		sum = (long) (a+b+c);
		
		System.out.println(sum);
	}
}
