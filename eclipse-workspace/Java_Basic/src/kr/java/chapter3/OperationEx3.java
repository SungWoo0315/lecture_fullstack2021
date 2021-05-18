package kr.java.chapter3;

public class OperationEx3 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);

		System.out.println(0 == b);
		System.out.println(-1 == a);
		
		boolean b1 = (a > b);
		System.out.println( b1 );
		
		
		System.out.println( (5 > 3) && ( 5 > 2));
		System.out.println( (5 > 3) || ( 5 > 2));
		
		
		int num1 = 100;
		
		System.out.println( num1 + ", " + (num1 += 2) );

		
		
		
		
		

	}

}
