package ex.day8;

import java.util.Scanner;

public class ExMorseCode2 {

	public static void main(String[] args) {

		// 이동희
		// https://github.com/Edonghee/2021study/blob/main/0524/%EC%88%98%EC%97%85/MossMain.java		Scanner sc = new Scanner(System.in);
		
		Scanner sc =new Scanner(System.in);
		String[] str = sc.nextLine().split(""); // HELLO -> H E L L O
		
		String[] moss = {
				".-","-...","-.-.","-..",".","..-.","--.", // A~G
				"....","..",".---","-.-",".-..","--","-.", // H~M
				"---",".--.","--.-",".-.","...","-","..-",
				"...-",".--","-..-","-.--","--.."};
		String[] ap = {
			"A","B","C","D","E","F","G",
			"H","I","J","K","L","M","N",
			"O","P","Q","R","S","T","U",
			"V","W","X","Y","Z"	
		};
		
		String result = "";
		
		for(int i=0; i<str.length; i++) {
			
			for(int j=0; j<ap.length; j++) {
			
				if(str[i].equalsIgnoreCase(ap[j])) {
					result += moss[j]+ " ";
					continue;
				}
			}
		}
		System.out.println(result);
		
		
		
	}

}
