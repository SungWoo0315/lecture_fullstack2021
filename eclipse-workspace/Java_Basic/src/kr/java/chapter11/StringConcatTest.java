package kr.java.chapter11;

public class StringConcatTest {


	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		String str1 = new String("Java");
		String str2 = "Programing";
		String result = "";
		
		for(int i =0; i <= 100000; i++) {
			result = str1.concat(" ");
			result = result.concat(str2);
		}
				
		//끝 시점 시간.
		long end = System.currentTimeMillis();
		
		System.out.println("----------- Concatenating --------------");
		System.out.println("시간: " + (end - start)/1000);		
		
		
		start = System.currentTimeMillis();
		
		for(int i =0; i <= 100000; i++) {
			result += " ";
			result += str2;
		}
		
		end = System.currentTimeMillis();
		
		System.out.println("----------- + --------------");
		System.out.println("시간: " + (end - start)/1000);		
		
	}
}
