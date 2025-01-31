package ch08.sec13;
//교재 p388 실습하기
public class ImplClass implements InterfaceC {
	public void methodA() {
		System.out.println("methodA() 실행");
	}	
	
	public void methodB() {
		System.out.println("methodB() 실행");
	}
	
	@Override
	public void methodC() {
		System.out.println("methodC() 실행");
	}
}
