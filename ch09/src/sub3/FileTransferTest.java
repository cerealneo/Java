package sub3;
/*
 *  날짜 : 2025/01/16
 *  이름 : 이민성
 *  내용 : java 파일 복사 실습하기
*/

import java.io.*;


public class FileTransferTest {

	public static void main(String[] args) {
		// 파일 경로 설정
		String source = "C:\\Users\\lotte6\\Desktop\\Sample.tif";
		String target = "C:\\Users\\lotte6\\Desktop\\Sample2.tif";

		try {
			// 스트림 생성
			FileInputStream fis = new FileInputStream(source); // 입력스트림
			FileOutputStream fos = new FileOutputStream(target); // 출력스트림

			//파일 복사
			fis.transferTo(fos);

			

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
