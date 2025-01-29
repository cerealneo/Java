package ch07.sec10.exam01;

//교재 p327 실습하기
public class Phone {
	String owner;

	Phone(String owner) {
		this.owner = owner;
	}

	void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}

	void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}
