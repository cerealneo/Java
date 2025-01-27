package test6.sub02;

/*
 * 날짜 : 2025/01/27
 * 이름 : 이민성
 * 내용 : 자바 총정리 연습문제
*/
public class Main {
	public static void main(String[] args) {
		Product product = new Product("P001","키보드",35000,10);
		
		product.printProductInfo();
		System.out.println("----------------------------");
		
		product.updatePrice(3000);
		System.out.println("----------------------------");
		
		product.printProductInfo();
		System.out.println("----------------------------");
		
		product.addStock(5);
		System.out.println("----------------------------");
		
		product.printProductInfo();
		System.out.println("----------------------------");
	}
}
