package ch07.sec10.exam01;

//교재 p328 실습하기
public class SmartPhone extends Phone {
	SmartPhone(String owner) {
		// Phone 생성자 호출
		super(owner);
	}

	void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
