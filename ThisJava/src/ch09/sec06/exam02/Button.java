package ch09.sec06.exam02;
//교재 p412 실습하기
public class Button {
	public static interface ClickListener {
		void onClick();
	}
	
	private ClickListener clickListener;
	
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
}

