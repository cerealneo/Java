package ch07.sec06.package2;

import ch07.sec06.package1.A;

//교재 p306 실습하기
public class D extends A {
	public D() {
		// A() 생성자 호출
		super(); // o
	}

	public void method1() {
		// A 필드값 변경
		this.field = "value"; // o
		// A 메소드 호출
		this.method(); // o
	}

	public void method2() {
		// A a = new A(); //x
		// a.field = "value"; //x
		// a.method(); //x
	}
}
