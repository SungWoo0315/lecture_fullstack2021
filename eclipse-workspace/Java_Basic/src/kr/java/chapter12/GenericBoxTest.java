package kr.java.chapter12;

public class GenericBoxTest {

	public static void main(String[] args) {
		
		Box box = new Box();
		box.set("안녕");
		box.set( new Integer(100) );
		//
		String str = (String) box.get();

		Box2<String> box2 = new Box2();
		Box2<String> box3 = new Box2<String>();
		
		box2.set("안녕");
		str = box2.get();
		
	}
}



class Box {
	private Object obj;
	
	public void set(Object o) {
		this.obj = o;
	}
	public Object get() {
		return this.obj;
	}
}

class Box2<String> {
	private String str;
	
	public void set(String s) {
		this.str = s;
	}
	public String get() {
		return this.str;
	}
	
}

