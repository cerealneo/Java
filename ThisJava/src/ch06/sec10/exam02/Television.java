package ch06.sec10.exam02;
//교재 p251 실습하기
public class Television {
	static String company = "MyCompany";
	static String model = "LCD";
	static String info;
	
	static {
		info = company+"-" + model;
	}
}