package ch06.sec08.exam01;
//교재 p235 실습하기
public class CalculatorExample {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		
		myCalc.poweron();
		
		int result1 = myCalc.plus(5,6);
		System.out.println("result1 : "+result1);
		
		int x = 10;
		int y = 4;
		
		double result2 = myCalc.divide(x, y);
		System.out.println("result2 : "+result2);
		
		myCalc.poweroff();
	}
}
