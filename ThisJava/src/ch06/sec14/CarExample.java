package ch06.sec14;
//교재 p274 실습하기
public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setSpeed(-50);
		System.out.println("현재속도 : "+myCar.getSpeed());
		
		myCar.setSpeed(60);
		System.out.println("현재속도 : "+myCar.getSpeed());
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재속도 : "+myCar.getSpeed());
	}
}
