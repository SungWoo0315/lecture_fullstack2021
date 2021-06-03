package ch02;

public class Variable1Test {
	
	// 1. 멤버 필드(속성, 변수)
	// 자료형 이름;
	// 자료형 이름 = 리터럴;
	// 리터럴: 자료의 표기 방법
	
	// 자료형: 기본자료형, 클래스, 배열, Enum
	
	public static void main(String[] args) {
		byte b = 127; // 8bit -> 1 부호
		// 
		double d1 = Double.MAX_VALUE;
		double d2 = Double.MAX_VALUE + 2000.0 ;
		double d3 = Double.MAX_VALUE * 1.2 ;
		double d4 = Double.MAX_VALUE * 1000 ;
		
		System.out.println(d1 + ": " + Double.toHexString(d1));
		System.out.println(d2 + ": " + Double.toHexString(d2));
		System.out.println(d3 + ": " + Double.toHexString(d3));
		System.out.println(d4 + ": " + Double.toHexString(d4));
	}
}












