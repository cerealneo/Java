package ch06.sec15;
//교재 p276 실습하기
public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		return singleton;
	}
}
