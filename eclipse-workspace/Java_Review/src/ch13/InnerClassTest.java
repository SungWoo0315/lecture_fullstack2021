package ch13;

import ch10.Buy;

// Outer class
public class InnerClassTest {
	
	
	// 인스턴스 내부 클래스
	class InnerClass {
		String name;
		static final int a = 0;
		
		void info() {
			
		}
	}

	private int num = 10;
	private static int snum = 10;
	
	
	// 정적 내부 클래스
	static class StaticInnerClass {
		int a = 0;
		static int i = 0;
		
		void info() {
			//num += 1;
			snum += 10;
		}
	}
	
	
	// 지역 내부 클래스 -> method
	
	public void local() {
		// Test t0 = new Test();
		
		class Test {
			int a;
			String n;
		}
		//  --> 
		Test t = new Test();
	}
	
	public Runnable getRunnable() {
		
		class MyRunnable implements Runnable {
			@Override
			public void run() {
			}
		}
		
		return new MyRunnable();
	}
	
	public int getint() {
		
		String a = "";
		String b = "CC";
		b = a;
		
		return 0;
	}
	
	String a = "";

	Object o = new Object() {
		@Override
		public String toString() {
			return "------";
		}
	};
	
	public Object getobj() {
		
		return new Object() {
			@Override
			public String toString() {
				return "------";
			}
		};
	}
	
	Buy b = new Buy() {
		
		@Override
		public void buy() {
			
		}
	};
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// 익명 내부 클래스
	
	

}
