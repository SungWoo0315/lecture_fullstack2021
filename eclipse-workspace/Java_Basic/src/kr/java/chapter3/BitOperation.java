package kr.java.chapter3;

public class BitOperation {

	public static void main(String[] args) {
		int num1 = 5;  // 0101
		int num2 = 10; // 1010
		
		int result = num1 & num2; // 0000
		System.out.println("num1 & num2 = " + result);
		
		result     = num1 | num2; // 
		System.out.println("num1 | num2 = " + result);

		result     = num1 ^ num2; // 
		System.out.println("num1 ^ num2 = " + result);
		
		result     = ~num1      ; //
		System.out.println("~num1 = " + result);
		
		
		// 논리 연산자와 비트 논리 연산자 차이
		boolean t = (num1 >= num2 ) && ( num1 <= num2);
		// Not OK
		// t = (num1 & num2 ) && ( num1 ^ num2);
		// OK
		t = ( 5 > 10) & ( 10 < 20); // false & true : 비트 연산
		System.out.println(t);

		t = ( 5 < 10) & ( 10 < 20); // true & true : 비트 연산
		System.out.println(t);
		
		/** Shift operator
		 * bit wise operation
		 *  - left, right, 채움 
		 */
		
		int n1 = 5;
		int n2 = -5;
		
		System.out.println("5 << 2 =" + (n1 << 2) ); // 
		System.out.println("5 << 3 =" + (n1 << 3) );
		
		System.out.println("5 >> 1 =" + (n1 >> 1) );
		System.out.println("5 >> 2 =" + (n1 >> 2) );
		System.out.println("5 >> 3 =" + (n1 >> 3) );

		
		System.out.println("-5 << 2 =" + (n2 << 2) ); // 
		System.out.println("-5 << 3 =" + (n2 << 3) );
		
		System.out.println("-5 >> 1 =" + (n2 >> 1) );
		System.out.println("-5 >> 2 =" + (n2 >> 2) );
		System.out.println("-5 >> 3 =" + (n2 >> 3) );
		
		
	
		System.out.println("5 >>> 1 =" + (n1 >>> 1) );
		System.out.println("5 >>> 2 =" + (n1 >>> 2) );
		System.out.println("5 >>> 3 =" + (n1 >>> 3) );
		
		System.out.println("-5 >>> 1 =" + (n2 >>> 1) );
		System.out.println("-5 >>> 2 =" + (n2 >>> 2) );
		System.out.println("-5 >>> 3 =" + (n2 >>> 3) );
		
		// 
		System.out.println("5 >>> 1 =" + Integer.toBinaryString(n1 >>> 1) );
		System.out.println("-5 >>> 1 =" + Integer.toBinaryString(n2 >>> 1) );

		
		
		
		
		
		
		
		

	}

}
