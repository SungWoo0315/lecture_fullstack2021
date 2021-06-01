package kr.java.chapter13;

public class MyClass1 {
	
	class MyInnerClass {
		// 멤버 속성
		static final int age = 0;
		String name;
		
		public void test() {}
		
	}
	
	public void test() {
		
		MyInnerClass in = new MyInnerClass();
	}

}
