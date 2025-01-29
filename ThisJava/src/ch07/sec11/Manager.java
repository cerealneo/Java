package ch07.sec11;

//교재 P333 실습하기
public non-sealed class Manager extends Person {
	@Override
	public void work() {
		System.out.println("생산 관리를 합니다.");
	}
}
