package kr.java.chapter11;

public class StringBuilderTest {


	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		String str1 = new String("Java");
		String str2 = "Programing";

		StringBuilder result = new StringBuilder();
		
		result.append(str1);
		result.append(str2);
		System.out.println(result);
		
		String result2 = result.toString();

		
//		for(int i =0; i <= 10000; i++) {
//			result.append(str1);
//			result.append(str2);
//		}
//				
//		//끝 시점 시간.
//		long end = System.currentTimeMillis();
//		
//		System.out.println("----------- Concatenating --------------");
//		System.out.println("시간: " + (end - start)/1000);		

		
		
		
		
		
		
				
	}
}
