package kr.java.chapter11;

public class StringTest {
	public static void main(String[] args) {
		
		
		String str1 = new String("abc");
		String str2 = "abc";
		String str3 = "abc";

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

		str2 = "efg";
		System.out.println(str2);
		System.out.println(str3);
		
		//
		String str4;
		str4 = "하나둘셋";
		System.out.print(str4 + " : ");
			
		/** charat(index) **/
		// dot operator: .
		System.out.print(str4.charAt(0));
		System.out.print(str4.charAt(1));
		System.out.print(str4.charAt(2));
		System.out.print(str4.charAt(3));
		// System.out.print(str4.charAt(4));

		System.out.println("");

		
		int len = str4.length();
		
		for(int i = 0; i < len; i++) {
			
			System.out.print(str4.charAt(i));

		}
		
		/** equals(string) **/
		
		System.out.println(str4.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str3.equals("abc"));

		if( str3.equals("abc") ) {
			//
		}
		
		//
		
		String[] strs = "하 나 두 ㄹ ㅅ ㅔ 넷".split(" ");
		System.out.println(strs.length);

		System.out.println(strs[0]);
		System.out.println(strs[6]);

		for(int i = 0; i < len; i++) {
			
			System.out.print(strs[i]);

		}
		System.out.println("------ substring --------");
		System.out.println("하 나 두 ㄹ ㅅ ㅔ 넷".substring(2, 5));

		
		
	}

}
