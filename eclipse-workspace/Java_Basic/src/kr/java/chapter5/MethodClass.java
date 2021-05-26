package kr.java.chapter5;


public class MethodClass {
	
	// 멤버 변수/필드/속성...
	String name;
	
	// 멤버 메소드 들...
	public int add(int i1, int i2) {
		int result;
		result = i1 + i2;
		return result;
		
//		return i1 + i2;
	}
	

	public void printTenTotal() {
		int total = getTenTotal();
		System.out.println(total);
	}
	
	public int getTenTotal() {
		//...
		return 10*10; // 1. 값을 반환 
	}
	
	public void printGreeting(String name) {
		System.out.println(name + " Hello...");
		return; // 2. void 반환
	}
	
	public void printGreeting2(String name) {
		System.out.println(name + " Hello...");
		// return; // 
	}
	
	public void divide(int num1, int num2) {
		if(num2 == 0) {
			System.out.println("0일수 없음...");
			return; // 3. code break 의미
		} else {
			//....
		}
	}
	
	
	public void test(int num1, int num2) {
		for(int i = 0; i < 100; i++) {
			if( i == 0) {
				return;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
