package ch06;

public class VariableScopeEx {

	// 변수/식별자/객체
	// 멤버변수 == 인스턴스 변수 == 클래스 변수
	int a = 0;
	int b = a;
	
	public static void main(String[] args) {
		
	}
	
	public void test() {
		this.a = 10;
	}
	// 지역변수: 메서드 ㅁ내부에서 선언된 변수.
	//   - 메서드의 매개변수
	public void local(String a, int b) {
		int c = 10;
		c = b + 100;
	}
	

}
