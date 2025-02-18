package test6.sub02;

public class Product {
	private String productId;
	private String productName;
	private int price;
	private int quantity;
	
	public Product(String productId, String productName, int price, int quantity) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void updatePrice(int newPrice){
		this.price = newPrice;
        System.out.println(productName + " 가격 수정 됨");
	}
	
	public void addStock(int amount) {
		this.quantity += amount;
        System.out.println(productName +" "+ quantity +"개 재고 추가 됨");
	}
	
	public void printProductInfo(){
		System.out.println("상품 ID : "+productId);
		System.out.println("상품이름 : "+productName);
		System.out.println("상품가격 : "+price);
		System.out.println("재고수량 : "+quantity);
	}
}
