package sub1;
/*
 *  날짜 : 2025/01/07
 *  이름 : 이민성
 *  내용 : java 클래스 실습하기
 */
public class ClassTest {
	public static void main(String[] args) {
		//Car 객체 생성
		Car sonata = new Car();
		
		//객체 초기화
		sonata.name = "소나타";
		sonata.color = "흰색";
		sonata.speed = 0;
		
		//객체 상호작용
		sonata.speedUp(100);
		sonata.speedDown(20);
		sonata.show();
		
		//객제 선언
		Car avante;
		
		//객체 생성
		avante = new Car();
		
		//객체 초기화
		avante.name="아반테";
		avante.color="흰색";
		avante.speed=10;
		
		//객체 상호작용
		avante.speedUp(70);
		avante.speedDown(20);
		avante.show();
		
		//Account 객체 생성과 초기화
		Account kb = new Account();
		kb.bank = "국민은행";
		kb.id = "110-12-1101";
		kb.name = "김유신";
		kb.balance= 10000;
		
		//객체 상호작용
		kb.deposit(100000);
		kb.withdraw(5000);
		kb.show();
		
		Account uari = new Account();
		uari.bank="우리은행";
		uari.id="110-11-1021";
		uari.name="김춘추";
		uari.balance=10000;
		
		uari.deposit(10000);
		uari.withdraw(5000);
		uari.show();
		
		
		
		
		
		
		
	}
}
