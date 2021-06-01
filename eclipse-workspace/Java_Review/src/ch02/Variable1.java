package ch02;

public class Variable1 {
	
	// 1. 멤버 필드(속성, 변수)
	// 자료형 이름;
	// 자료형 이름 = 리터럴;
	// 리터럴: 자료의 표기 방법
	
	// 자료형: 기본자료형, 클래스, 배열, Enum
	char ch; // 선언!!!
	char ch1 = 'A'; // 65
	
	float  f_name;
	float f_name2 = 1.0F;  // 4바이트
	double d_name = 1.0;   // 8바이트

	double d_name3 = Double.MAX_VALUE;
	// double d_name4 = Double.MAX_VALUE + 1.0 ;

	
	// 바이트: -128~127
	byte b1 = -128;
	byte b2 = 127; 
	//byte b3 = 128; 
	
	
	int i = 10;
	long l = Long.MAX_VALUE;
	long l2 = 10L;
	
	// true, false 논리자료형
	boolean isboolean;
	boolean isnumber = true;
	boolean ischar = false;
	
	
	// 2. 멤버 메소드
	// Modifier [static] 리턴형식 이름(매개변수) { }
	// Modifier: public, protected, package, private
	// 리턴형식: void, 자료형
	
	public void printinfo(int i) {
		System.out.println(ch1);
		System.out.println(b2);
	}
	public void printinfo2(int i, long l, short s, byte b) {
		// 코드블럭
	}
	
	{
		// 코드블럭
	}
	
	public int getNumber() {
		return 0; // return 리턴자료형
	}
	
	static int k = 100;
	
	// Starting point. 시작점
	public static void main(String[] args) {
		int j = 100;
		char c = 'a';

		//System.out.println(ch1);
		System.out.println(k);

		char ch2; // 선언!!!
		char ch3 = 'A'; // 65
		
		//System.out.println(ch2);
		System.out.println(ch3);
		
	}
	

}


















