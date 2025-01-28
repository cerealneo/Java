package ch07.sec09;

//교재 p323 실습하기
public class InstanceofExample {
	public static void personInfo(Person person) {
		System.out.println("name: " + person.name);
		person.walk();
		
		if(person instanceof Student student) {
			System.out.println("studentNo: " + student.studentNo);
			student.study();
		}
	}

	public static void main(String[] args) {
		// Person 객체를 매개값으로 제공하고 personInfo 메소드 호출
		Person p1 = new Person("홍길동");
		personInfo(p1);

		System.out.println();

		// Student 객체를 매개값으로 제공하고 personInfo 메소드 호출
		Person p2 = new Student("김길동", 10);
		personInfo(p2);
	}
}