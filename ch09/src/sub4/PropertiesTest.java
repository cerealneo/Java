package sub4;

import java.io.*;
import java.util.*;

/*
 *  날짜 : 2025/01/16
 *  이름 : 이민성
 *  내용 : java Properties 실습하기
*/
public class PropertiesTest {

	public static void main(String[] args) {
		//프로퍼티 생성
		Properties prop = new Properties();
		prop.setProperty("A", "Apple");
		prop.setProperty("B", "Banana");
		prop.setProperty("C", "Cherry");
		
		System.out.println(prop);
		
		String target = "C:\\Users\\lotte6\\Desktop\\Fruit.Properties"; //확장자 Properties
		
		try {
			//스트림 생성
			FileOutputStream fos = new FileOutputStream(target);
			
			//프로퍼티 파일 저장(직렬화)
			prop.store(fos, null);
			
			//스트림 해제
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/////////////////////////////////////////////////////////////////
		String source = "C:\\Users\\lotte6\\Desktop\\City.Properties";
		Properties sourceProp = new Properties();
		
		try {
			//한글 안깨짐
			//FileReader fr = new FileReader(source); //스트림 생성
			//sourceProp.load(fr); //프로퍼티 파일 읽기
			//fr.close(); //스트림 해제
			
			//한글 깨짐
			FileInputStream fis = new FileInputStream(source); //스트림 생성
			sourceProp.load(fis); //프로퍼티 파일 읽기
			fis.close(); //스트림 해제
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(sourceProp);
		System.out.println("kor 키값 : " +sourceProp.getProperty("kor"));
		System.out.println("usa 키값 : " +sourceProp.getProperty("usa"));
		System.out.println("jpn 키값 : " +sourceProp.getProperty("jpn"));
		System.out.println("chi 키값 : " +sourceProp.getProperty("chi"));
	}

}
