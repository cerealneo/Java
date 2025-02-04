package ch11.sec05;

//교재 p481 실습하기
public class ThrowsExample2 {
	public static void main(String[] args) throws Exception {
		findClass();
	}

	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}
}
