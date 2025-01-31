package ch08.sec13;
//교재 p387 실습하기
public sealed interface InterfaceA permits InterfaceB {
	void methodA();
}
