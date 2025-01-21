package sub2;

import java.util.*;

/*
 *  날짜 : 2025/01/21
 *  이름 : 이민성
 *  내용 : java 컬렉션 스트림 실습하기
*/

class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}

public class CollectionStreamTest {

	public static void main(String[] args) {
		List<String> people = new ArrayList<>();
		people.add("김유신");
		people.add("김춘추");
		people.add("장보고");
		people.add("강감찬");
		people.add("이순신");
		
		//외부 반복자를 이용한 출력
		for(String p : people) {
			System.out.println(p);
		}
		
		System.out.println();
		
		Iterator<String> It = people.iterator();
		while(It.hasNext()) {
			System.out.println(It.next());
		}
		
		System.out.println();
		
		//내부 반복자를 이용한 출력
		people.stream().forEach((p)->{
			System.out.println(p);
		});
		
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("김유신",23));
		persons.add(new Person("김춘추",21));
		persons.add(new Person("장보고",33));
		persons.add(new Person("강감찬",43));
		persons.add(new Person("이순신",53));
		
		//외부 반복자
		for(Person p : persons) {
			System.out.println(p);
		}
		
		//내부 반복자
		persons.stream().forEach(System.out::println);
	}

}
