package ch07.sec09;

//교재 p325 실습하기
public class Student extends Person {
	public int studentNo;

	public Student(String name, int studentNo) {
		super(name);
		this.studentNo = studentNo;
	}

	public void study() {
		System.out.println("공부를 합니다.");
	}
}
