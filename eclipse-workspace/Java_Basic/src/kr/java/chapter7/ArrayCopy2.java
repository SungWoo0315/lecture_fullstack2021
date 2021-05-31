package kr.java.chapter7;

public class ArrayCopy2 {

	public static void main(String[] args) {
		
		Book[] book1 = new Book[3];
		Book[] book2 = new Book[3];
		
		book1[0] = new Book("태백산맥");
		book1[1] = new Book("차령산맥");
		book1[2] = new Book("계백산맥");
		//
		System.arraycopy(book1, 0, book2, 0, book2.length);
		
		for(Book b: book2) {
			System.out.println(b.name);
		}
		
		System.out.println("=== 얕은복사(참조(레퍼런스)복사) ====");
		// book1 0번
		book1[0].name = "구로산맥";
		
		for(Book b: book1) {
			System.out.println(b.name);
		}
		for(Book b: book2) {
			System.out.println(b.name);
		}
		
		System.out.println("=== 깊은복사(객체생성) ====");
		// 깊은복사!
		book1[0] = new Book("한라산맥");
		for(Book b: book1) {
			System.out.println(b.name);
		}
		for(Book b: book2) {
			System.out.println(b.name);
		}
		
		
	}
}
