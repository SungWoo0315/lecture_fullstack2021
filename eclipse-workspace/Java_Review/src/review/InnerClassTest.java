package review;

// 외부클래스
public class InnerClassTest {
	
	// 멤버
	InnerClass inner;
	

	// 1. 인스턴스 이너클래스
	class InnerClass {
		private int a;
		// static 제한!
		//static String name;
		final static String name = "";
		
		public void info() {
			
		}
	}
	
	
	// 2.static innerclass
	static class StaticInnerClass {
		
		static String name;
		
		public void info() {
		}
		
		public static void info2() {
		}
	}
	
	// 3. Local innerclass
	public void test() {
		
		int a; // 지역변수

		//LocalInnerClass local1;
		//local1 = new LocalInnerClass();
		
		class LocalInnerClass {
			private String name;
			
			public LocalInnerClass() {
			}

			public String info() {
				return this.name; // 로컬 클래스
			}
		}

		LocalInnerClass local;
		local = new LocalInnerClass();
	}
	
	// 4. Anonymouse Innerclass
	public Object getObject() {
		return new Object() {
			@Override
			public String toString() {
				return "별점: " + 1000;
			}
		};
	}
	public Object getObject2() {
		
		Object obj = new Object() {
			@Override
			public String toString() {
				return "별점: " + 1000;
			}
		};
		
		return obj;
	}
	
	
	public static void main(String[] args) {
		// 1. 인스턴스 이너클래스 객체.
		InnerClassTest out = new InnerClassTest();
		InnerClass io = out.new InnerClass();
		
		// 2. static class 사용
		System.out.println(StaticInnerClass.name);
		StaticInnerClass.info2();
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
