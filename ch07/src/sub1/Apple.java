package sub1;

public class Apple { // 암묵적으로 OBJECT 클래스를 상속

	private String country;
	private int price;

	public Apple(String county, int price) {
		this.country = county;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Apple [country=" + country + ", price=" + price + "]";
	}

	

}
