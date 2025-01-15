package ch04.sec08;
//교재 p139 실습하기
public class ContinueExample {
	public static void main(String[] args) throws Exception {
		for(int i=1; i<=10; i++) {
			if(i%2 !=0) {
				continue;
			}
			System.out.print(i+" ");
		}
	}
}
