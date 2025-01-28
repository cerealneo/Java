package ch07.sec07.exam02;

//교재 p311 실습하기
public class Child extends Parent {

	@Override
	public void method2() {
		System.out.println("Child-method2()");
		super.method2();
	}
	
	public void method3() {
		System.out.println("Child-method3()");
	}

}
