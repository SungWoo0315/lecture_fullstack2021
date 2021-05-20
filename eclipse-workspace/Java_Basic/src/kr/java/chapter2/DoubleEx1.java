package kr.java.chapter2;

public class DoubleEx1 {

	public static void main(String[] args) {
		
		double dnum = 3.14;
		float fnum = 3.14F;
		
		System.out.println(dnum);
		System.out.println(fnum);

		// minus
		double dnum2 = -3.5;
		float fnum2 = -3.5F;

		System.out.println(dnum2);
		System.out.println(fnum2);

		// float to int
		System.out.println("double2long: " + (long)dnum2);
		System.out.println("double2int: " + (int)dnum2);
		System.out.println("double2short: " + (short)dnum2);
		System.out.println("double2byte: " + (byte)dnum2);

//		int i1 = fnum;
//		long l1 = dnum;

		// int to float/double
		int i1 = 32768;
		int i2 = 2147483647;  // max
		int i3 = -2147483648; // min

		double dnum3 = i2;
		System.out.println("--------------------------------");
		System.out.println("dnum3: " + dnum3);
		System.out.println("dnum3: " + (double)i2);

		System.out.println("-2147483648: " + (double)i3);
		
		boolean b1 = false;
		boolean b2 = true;
		
		b1 = true;
		b1 = false;
		
		System.out.println("Is true: " + true);
		System.out.println("Is false: " + false);
		
		b1 = b2;
		System.out.println("b1: " + b1);
		
//		i1 = (int) b1;
//		b1 = (boolean) i1;
//
//		byte bt = 1;
//		b1 = (boolean)bt;
//		bt = (byte)b1;
		
		
		// 값 변경이 안되는 식별자! (변수) => 상수 Constant.
		// 값이 미리/기/사전에 선언을하고 사용하는 목적!
		final double PI = 3.14;
		final double PI2 = 3.14;
		
		
		
		
		
		
	}

}
