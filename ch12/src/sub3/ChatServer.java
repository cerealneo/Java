package sub3;

import java.io.*;
import java.net.*;

/*
 *  날짜 : 2025/01/22
 *  이름 : 이민성
 *  내용 : java 채팅 프로그래밍 실습하기
*/
public class ChatServer {
	public static void main(String[] args) {
		System.out.println("[server]");
		
		ServerSocket serverSocket = null;
		Socket socket= null;
		
		try {
			
			serverSocket = new ServerSocket(9001);
			System.out.println("연결대기...");
			
			socket = serverSocket.accept();
			System.out.println("연결 수립");
			
			Thread receiver = new ReceiverThread(socket);
			Thread sender = new SenderThread(socket);
			
			receiver.start();
			sender.start();
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		///System.out.println("Server 채팅 종료...");
	}
}
