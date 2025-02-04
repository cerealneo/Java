package ch11.sec06;

//교재 p482 실습하기
public class InsufficientException extends Exception {
	public InsufficientException() {
	}

	public InsufficientException(String message) {
		super(message);
	}
}
