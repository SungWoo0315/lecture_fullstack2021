package kr.java.chapter2;

public class CharacterEx2 {

	public static void main(String[] args) {
		char ch1 = '한';
		char ch2 = '\uD55C'; // 유티코드의 Escape sequence 형식

		char ch3 = '\uAE00'; // '글'

		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println("\uAE00:" + ch3);
		System.out.println("\\uAE00:" + ch3);

//		char ch3 = -66;
//		System.out.println(ch3);
		
		int  ich = -66;
		System.out.println((char)ich);
		
	}

}
