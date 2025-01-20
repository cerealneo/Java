package sub1;
/*
 *  날짜 : 2025/01/20
 *  이름 : 이민성
 *  내용 : java 스레드 실습하기
*/

//스레드 작업을 위한 Runnable 구현체 정의
class RunnableImpl implements Runnable {
	
	private String name;
	
	public RunnableImpl(String name) {
		this.name = name;
	}

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println(name + "스레드 실행중...");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name + "스레드 종료...");
	}
	
}


public class RunnableTest {
	public static void main(String[] args) {
		//Runnable 객체 생성
		Runnable run1 = new RunnableImpl("작업1");
		Runnable run2 = new RunnableImpl("작업2");
		
		//스레드 생성
		Thread t1 = new Thread(run1);
		Thread t2 = new Thread(run2);
		
		//스레드 실행
		t1.start();
		t2.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("스레드 실행중...");
			
			try {
				Thread.sleep(1000); //1초 대기
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("스레드 종료..."); //프로그램 종료
		
	}
}
