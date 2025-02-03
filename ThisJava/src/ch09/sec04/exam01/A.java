package ch09.sec04.exam01;
//교재 p404 실습하기
public class A {
	A() {
		// 로컬 클래스 선언
		class B {
		}

		// 로컬 객체 생성
		B b = new B();
	}

	void method() {
		// 로컬 클래스 선언
		class B {
		}

		// 로컬 객체 생성
		B b = new B();
	}
}
