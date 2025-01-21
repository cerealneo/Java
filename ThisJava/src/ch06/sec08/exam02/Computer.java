package ch06.sec08.exam02;
//교재 p237 실습하기
public class Computer {
	int sum(int ... values) {
		int sum =0;
		
		for(int i =0; i<values.length; i++) {
			sum += values[i];
		}
		
		return sum;
	}
}
