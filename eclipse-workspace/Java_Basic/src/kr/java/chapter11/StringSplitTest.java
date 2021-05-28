package kr.java.chapter11;

import java.util.StringTokenizer;

public class StringSplitTest {

	public static void main(String[] args) {
		String str = "Java Programming is funny things!";
		// 패턴 에러 String str = "Java\\Programming\\is\\funny\\things!";

		// split()
		String[] result = str.split(" ");
		for(String s : result) {
			System.out.println(s);
		}
		
		str = "Java Programming is funny things!";

		// StringTokenzer class
		StringTokenizer st = new StringTokenizer(str);
		while( st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
