package sub3;

import java.net.*;

/*
 *  날짜 : 2025/01/22
 *  이름 : 이민성
 *  내용 : java 채팅 프로그래밍 실습하기
*/
public class ChatClient {
	public static void main(String[] args) {
		
		System.out.println("[client]");
		
		Socket socket = null;
		
		try {
			socket = new Socket("127.0.0.1",9001);
			
			Thread receiver = new ReceiverThread(socket);
			Thread sender = new SenderThread(socket);
			
			receiver.start();
			sender.start();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		// System.out.println("client 채팅 종료...");
	}
}
