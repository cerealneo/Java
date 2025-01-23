package ch07.sec03.exam02;
//교재 p294 실습하기
public class SmartPhone extends Phone{

	public SmartPhone(String model, String color) {
		super(model, color);
		System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
	}

}
