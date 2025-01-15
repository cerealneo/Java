package sub2;
/*
 *  날짜 : 2025/01/07
 *  이름 : 이민성
 *  내용 : java 캡슐화 실습하기
 */
public class EncapuleTest {

	public static void main(String[] args) {
		
		//Car 객체 생성 초기화
		Car sonata = new Car("쏘나타","흰색",10);
		//캡슐화된 속성은 외부에서 참조할 수 없음 
		//sonata.name = "소나타";
		//sonata.color = "흰색";
		//sonata.speed = 0;
		
		sonata.speedUp(60);
		sonata.speedDown(20);
		sonata.show();
		
		Car avante = new Car("아반테","검정",0);
		avante.speedUp(100);
		avante.speedDown(80);
		avante.show();
		
		avante.setColor("회색");
		avante.show();
		
		
		Account kb = new Account("국민은행","110-11-1011","김유신",1000);
		kb.deposit(30000);
		kb.withdraw(21000);
		kb.show();
		
		kb.setName("김유진");
		kb.show();
		
		Account wr = new Account("우리은행","110-11-1211","김춘추",10000);
		wr.deposit(30000);
		wr.withdraw(25000);
		wr.show();
		
		wr.setBank("유리은행");
		wr.show();
		
		Book book1 = new Book("삼국지","나관중","10001",10);
		book1.show();
		
		boolean isOK = book1.borrowBook();
		if(isOK) {
			System.out.println("도서 대출 성공!");
		} else {
			System.out.println("도서대출 실패!");
		}
		
		book1.show();
		
		Book book2 = new Book("이것이 자바다","신용권","10002",0);
		book2.show();
		
		if(book2.borrowBook()) {
			System.out.println(book2.getTitle()+ " 도서 대출 성공!");
		} else {
			System.out.println(book2.getTitle()+ " 도서 대출 실패!");
		}
		
		
		Movie movie1 = new Movie("글래디에이터","리틀리스콘",8.0,10);
		
		movie1.showDetails();
		
		if(movie1.reserveSeat()) {
			System.out.println("영화 좌석 예매 완료!");
		} else {
			System.out.println("영화 좌석 예매 실패!");
		}
		
		movie1.showDetails();
		
		Movie movie2 = new Movie("타이타닉","제임스카메론",9.5,0);
		
		movie2.showDetails();
		
		if(movie2.reserveSeat()) {
			System.out.println("영화 좌석 예매 완료!");
		} else {
			System.out.println("영화 좌석 예매 실패!");
		}
		
		movie2.showDetails();
		
	}
}
