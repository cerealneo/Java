package sub8;
/*
 *  날짜 : 2025/01/09
 *  이름 : 이민성
 *  내용 : java 인터페이스 실습하기
 */
public class InterfaceTest {
	public static void main(String[] args) {
		
		//예제 1 - 표준화된 공통 클래스 구조 설계
		RemoteControl lg  = new RemoteLg();
		RemoteControl samsung  = new RemoteSamsung();
		
		lg.powerOn();
		lg.chDown();
		lg.soundUp();
		lg.powerOff();
		
		samsung.powerOn();
		samsung.chUp();
		samsung.soundDown();
		samsung.powerOff();
		
		//예제 2 - 유연성(다형성을 통한 결합도 완화)
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);
		
		socket.switchon();
		socket.switchoff();
		
		//예제 3 - 다중 상속 효과
		SmartTv stv = new SmartTv();
		stv.process();
		
	}
}
