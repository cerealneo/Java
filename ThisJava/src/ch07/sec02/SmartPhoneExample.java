package ch07.sec02;
//교재 p289 실습하기
public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("갤럭시","은색");
		
		System.out.println("모뎀 : "+myPhone.model);
		System.out.println("색상 : "+myPhone.color);
		
		System.out.println("와이파이 상태 : "+myPhone.wifi);
		
		myPhone.bell();
		myPhone.sendVoice("여보세요");
		myPhone.receiveVoice("안녕하세요! 저는 홍길동입니다.");
		myPhone.sendVoice("아 네, 반갑습니다.");
		myPhone.hangUp();
		
		myPhone.setWifi(true);
		myPhone.internet();
	}

}
