package ch09;

public class AbstractEx {

	// 추상클래스
	// abstract class 선언.
	//  - abstract method 선언. -> 코드블럭 X
	
	public static void main(String[] args) {
		
		Desktop d = new Desktop();
		d.turnOn();
		
		Computer c = new Desktop();
		c.turnOff();
		
		// 추상클래스는 new 연산자 XXXXXX
		// Computer c = new Computer();
		
		Computer cc = new Computer() {

			@Override
			public void display() {
			}

			@Override
			public void typing() {
			}
		};
		
		
		Object sss = new Object() {
			
			@Override
			public String toString() {
				return "..........";
			}
		};
		
		System.out.println(sss.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
