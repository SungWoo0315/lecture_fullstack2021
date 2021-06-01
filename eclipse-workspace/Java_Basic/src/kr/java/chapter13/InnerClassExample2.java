package kr.java.chapter13;

public class InnerClassExample2 {
	
	int num = 20;
	static int sum = 20;
	

	static class InnerClass {
		static String keyword = "STATIC INNER";
		
		public void info() {
			// num += 10;
			System.out.println("Inner.info()");
		}
		
		public static void printName() {
			System.out.println("Inner.printName()");
		}
	}
	
	public static void main(String[] args) {
		InnerClassExample2.InnerClass inner = new InnerClassExample2.InnerClass();
		
		System.out.println("Keyword: " + InnerClass.keyword);
		inner.info();
		InnerClass.printName();

	}

}
