package ch08.sec11.exam02;
//교재 p382 실습하기
public class Bus implements Vehicle {
	//추상 메소드 재정의
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
}

