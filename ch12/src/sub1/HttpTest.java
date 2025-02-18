package sub1;

import java.io.*;
import java.net.*;

/*
 *  날짜 : 2025/01/22
 *  이름 : 이민성
 *  내용 : java Http 통신 실습하기
*/
public class HttpTest {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedReader br = null;
		
		try {
			URL url = new URL("https://google.com");
			
			br = new BufferedReader(new InputStreamReader(url.openStream()));
			fos = new FileOutputStream("./result.txt");
			
			String line = null;
			
			while((line = br.readLine()) != null){
				System.out.println(line);
				fos.write(line.getBytes());
			}
			br.close();
			fos.close();
			
			
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("http 통신 종료...");
	}
}
