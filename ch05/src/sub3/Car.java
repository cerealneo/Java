package sub3;

// Car 클래스 정의(설계)
public class Car {

	//속성 (멤버 변수) - 클래스 속성은 캡슐화를 위해 무조건 private 선언
	private String name;
	private String color;
	private int speed;
	
	//클래스 변수(정적변수) - 객체 생성 없이 클래스 이름으로 직접 참조
	public static int count;
	
	//생성자 - 캡슐화된 속성을 초기화하기 위한 클래스 이름과 동일한 반환 타입이 없는 메서드
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;	
		count++;
	}
	
	//기능(멤버 메서드) - 클래스 기능은 무조건 public 선언
	//클래스 메서드(정적메서드) - 객체 생성 없이 클래스 이름으로 직접 호출
	public static int getcount() {
		return count;
	}
	
	//기능 (멤버 메서드) - 클래스 기능은 무조건 public 선언
	public void speedUp(int speed) {
		//this는 현재 클래스를 저장
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
		
	}
	public void show() {
		System.out.println("차량명 : "+this.name);
		System.out.println("차량색 : "+this.color);
		System.out.println("현재속도 : "+this.speed);
		
	}
	
	//Getter, Satter - 정의(욥션) - 캡슐화된 속성을 수정하기 위한 메서드
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
}
