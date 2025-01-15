package ch06.sec06.exam01;
//교재 p217 실습하기
public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		System.out.println("모델명 : "+myCar.model);
		System.out.println("시동여부 : "+myCar.start);
		System.out.println("현재속도 : "+myCar.speed);
		
	}
}
