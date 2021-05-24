package ex.day8;

import java.util.Scanner;

public class ExMorseCode3 {

	public static void main(String[] args) {

		// 박태경
		// https://github.com/tae1296/github-practice/blob/main/may/5.24/morse_code2.java
		// 박태경
		Scanner sc=new Scanner(System.in);
		
		String[] morse = { ".- ","-... ","-.-. ","-.. ",". ","..-. ",
		"--. ",".... ",".. ",".--- ","-.- ",".-.. ",
		"-- ","-. ","--- ",".--. ","--.- ",".-. ",
		"... ","- ","..- ","...- ",".-- ","-..- ",
		"-.-- ","--.. "};
		
		String str;
	
		int j;
				
		System.out.println("영어를 입력해주세요");
		str=sc.nextLine();
		
		for(int i=0; i<str.length();i++) { // HELLO
			
			if(str.charAt(i)>=65 && str.charAt(i)<=90) {
				j=65-str.charAt(i);
				System.out.print(morse[j]);
			}else if(str.charAt(i)>=97 && str.charAt(i)<=122) {
				j=122-str.charAt(i);
				System.out.print(morse[j]);
			}else {
				System.out.print(" ");
			}
		}
		
		
		
	}

}
