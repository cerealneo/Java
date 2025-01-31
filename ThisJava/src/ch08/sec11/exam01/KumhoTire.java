package ch08.sec11.exam01;
//교재 p378 실습하기
public class KumhoTire implements Tire {
	//추상 메소드 재정의
	@Override
	public void roll() {
		System.out.println("금호 타이어가 굴러갑니다.");
	}
}

