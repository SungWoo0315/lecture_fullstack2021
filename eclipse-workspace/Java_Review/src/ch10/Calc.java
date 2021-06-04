package ch10;

public interface Calc {
	
	double PI = 3.14;
	//static final int PI = 0;
	int ERROR = -999999;
	
	
	static int total(int[] arr) {
		int t = 0;
		for(int i : arr) {
			t += i;
		}
		return t;
	}
	
	int add(int n1, int n2);
	int substract(int n1, int n2);
	int times(int n1, int n2);
	int divide(int n1, int n2);
	
	default void descrition() {
		myMethod();

		System.out.println("계산시...");
	}
	
	
	private void myMethod() {
		System.out.println("private 메서드 입니다.");
	}
	
	private static void myStaticMethod() {
		System.out.println("private static 메서드 입니다.");
	}
	
	
}
