package sub2;
/*
 *  날짜 : 2025/01/20
 *  이름 : 이민성
 *  내용 : java 스레드 Interrupt 실습하기
*/

class SubThread extends Thread {
	public void run() {
		int i = 1;

		try {
			while (true) {
				System.out.println("subThread 실행..." + i);
				i++;

				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("SubThread 종료...");

	}
}

public class ThreadInterruptTest {
	public static void main(String[] args) {

		SubThread sub = new SubThread();
		sub.start();

		try {
			Thread.sleep(1000 * 10); // 10초 대기
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// 서브 스레드 일시정지 상태에서 종료 상태로 전환
		sub.interrupt();

		System.out.println("메인스레드 종료...");

	}
}
