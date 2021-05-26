package ex.day10.P;

public class BusMain {

	public static void main(String[] args) {
		// Bus 필드 name, number 접근을 위해
		// 1. 직접 사용하게 하거나
		Bus b = new Bus("", 0);
		//b.name = "";
		//b.number = 0; // default, protected, public
		
		// 2. 메서드를 사용해보세요.
		//   default, protected, public 가진 메서드
		b.getName();
	}
}
