package sub1;

import java.io.*;
import java.net.*;
import java.net.http.*;

/*
 *  날짜 : 2025/01/22
 *  이름 : 이민성
 *  내용 : java Http 통신 실습하기
*/
public class HttpClientTest {
	public static void main(String[] args) {
		HttpClient httpClient = HttpClient.newHttpClient();
		
		HttpRequest request = HttpRequest
								.newBuilder()
								.uri(URI.create("https://google.com"))
								.GET()
								.build();
		
		try {
			HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
			
			System.out.println("상태코드 : "+response.statusCode());
			System.out.println("응답내용 : "+response.body());
			
		
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
