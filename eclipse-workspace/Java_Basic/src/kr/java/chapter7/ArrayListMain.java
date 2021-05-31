package kr.java.chapter7;

import java.util.ArrayList;

public class ArrayListMain {

	public static void main(String[] args) {
		//ArrayList<Book> library = new ArrayList<Book>();
		ArrayList<Book> library1 = new ArrayList<>();
		
		Book b1 = new Book("태백산맥");
		library1.add( b1 );
		library1.add( new Book("차령산맥"));
		library1.add( new Book("한라산맥"));
		library1.add( new Book("백두산맥"));
		library1.add( new Book("구로산맥"));
		
		System.out.println("Books size: " + library1.size());

		//
		library1.remove(2);
		if( library1.remove( b1 ) ) { // new Book("태백산맥")) ) {
			System.out.println("OK");
		}
		
		System.out.println("Books size: " + library1.size());

		System.out.println("Books 2: " + library1.get(2).name );
		System.out.println("Books 3: " + library1.get(3).name );
		
		for( Book b: library1) {
			
		}
		
		for(int i = 0; i < library1.size(); i++) {
			System.out.println(library1.get(i).name );
		}
		
		

	}

}
