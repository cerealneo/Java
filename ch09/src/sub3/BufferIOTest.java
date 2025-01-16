package sub3;

import java.io.*;


/*
 *  날짜 : 2025/01/16
 *  이름 : 이민성
 *  내용 : java 파일 버퍼스트림 실습하기
*/

public class BufferIOTest {
	public static void main(String[] args) {
		//파일 경로 설정
		String source = "C:\\Users\\lotte6\\Desktop\\Sample.tif";
		String target = "C:\\Users\\lotte6\\Desktop\\Sample2.tif";
		
		
		try {
			//스트림 생성
			FileInputStream fis = new FileInputStream(source); //입력스트림
			FileOutputStream fos = new FileOutputStream(target); //출력스트림
			
			//보조스트림 생성 후 기본 스트림 연결
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			//스트림 데이터 전송
			while(true) {
				//입력스트림으로 파일 데이터 읽기
				int data = bis.read();
				if(data == -1) {
					//읽을 파일 데이터가 없을때
					break;
				}
				
				//출력스트림으로 파일 데이터 쓰기
				bos.write(data);
			}
			
			//스트림 해제
			bis.close();
			bos.flush(); // 출력버퍼는 해제전에 비워줌 (밀어내기 느낌)
			bos.close();
			
			
			fis.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료...");
	}
}
