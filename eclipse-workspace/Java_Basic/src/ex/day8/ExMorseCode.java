package ex.day8;

import java.util.Scanner;

public class ExMorseCode {

	public static void main(String[] args) {

		// 손현호
		// https://github.com/icraft2170/TIL/blob/master/0524/Array.java
		int start = 65;
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String alphabet2 = "abcdefghijklmnopqrstuvwxyz";
		String sign[] = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

		Scanner scan =new Scanner(System.in);
		String input = scan.nextLine();
		int num =0;
		for(int i=0;i<input.length();i++)
		{
		// HELLO : 
		System.out.println(alphabet.indexOf(input.charAt(i)) + ":" );
				
		if(alphabet.indexOf(input.charAt(i)) !=-1) {
			num = alphabet.indexOf(input.charAt(i));
		}else if(alphabet2.indexOf(input.charAt(i)) !=-1) {
			num = alphabet2.indexOf(input.charAt(i));
		}
		
		System.out.print( alphabet.substring(num,num+1) + sign[num] );
		}
		
	}

}
