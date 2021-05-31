package kr.java.chapter7;

public class ArrayCopy1 {

	public static void main(String[] args) {
		
		int[] array1 = {10, 20, 30, 40, 50};
		int[] array2 = {1,2,3,4,5};
		
		System.arraycopy(array1, 0, array2, 2, 5);			
		// 전체 복사
		System.arraycopy(array1, 0, array2, 0, array1.length);			

		for(int i : array2) {
			System.out.println(i);
		}
		
		Book[] book1 = new Book[3];
		Book[] book2 = new Book[3];
		
		book1[0] = new Book("태백산맥");
		book1[1] = new Book("차령산맥");
		book1[2] = new Book("계백산맥");
		
		System.arraycopy(book1, 0, book2, 0, book2.length);
		
	}
}
