package kr.java.chapter11;

public class StringIndexing {

	public static void main(String[] args) {
		String str = "Java Programming";
		
		System.out.println(str.indexOf("J"));
		System.out.println(str.indexOf('P'));
		System.out.println(str.indexOf("gram"));

		// 자르기
		System.out.println( str.substring(0, str.indexOf("gram")) );
		
		System.out.println(str.lastIndexOf("gram"));

		System.out.println(str.startsWith("java"));
		System.out.println(str.startsWith("Java"));
		
		
	}

}
