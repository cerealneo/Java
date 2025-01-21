package ch06.sec09;
//교재 p245 실습하기
public class Car {
	String model;
	int speed;
	
	Car(String model){
		this.model = model;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		this.setSpeed(100);
		System.out.println(this.model + "가 달립니다. (시속 : "+this.speed+ "km/h");
	}

}
