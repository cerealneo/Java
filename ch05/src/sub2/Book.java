package sub2;

public class Book {
		//속성
		private String title;
		private String author;
		private String isbn;
		private int availableCopies;
		
		//생성자
		public Book(String title, String author, String isbn, int availableCopies) {
			this.title = title;
			this.author = author;
			this.isbn=isbn;
			this.availableCopies = availableCopies;
		}
		
		public boolean borrowBook() {
			if(availableCopies>0) {
			availableCopies--;
			return true;
			}else {
				return false;
			}
		}
		
		public void returnBook() {
			availableCopies++;
			
		}
		
		
		public void show() {
			System.out.println("책 제목 : "+title);
			System.out.println("저자 이름 : "+author);
			System.out.println("ISBN 번호 : "+isbn);
			System.out.println("이용가능한 복사본 수 : "+availableCopies);
		}
		
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		
		public String getAuthor() {
			return author;
		}
		public void setAvailableCopies(int availableCopies) {
			this.availableCopies = availableCopies;
		}
		
		public String getIsbn() {
			return isbn;
		}
		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}
		
		public int getAvailableCopies() {
			return availableCopies;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		
}
