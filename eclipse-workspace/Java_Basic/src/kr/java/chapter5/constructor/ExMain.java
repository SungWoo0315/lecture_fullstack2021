package kr.java.chapter5.constructor;

public class ExMain {

	public static void main(String[] args) {
/*		Rectangle2 rect1 = new Rectangle2("사각", 20, 15);
		Rectangle2 rect2 = new Rectangle2("직사각1", 19, 80);
		
		System.out.println( rect1.name + ": " + rect1.getArea() ); 
		System.out.println( rect2.name + ": " + rect2.getArea() ); 
*/
		
		Circle1 c1 = new Circle1("피자", 10.0);
		Circle1 c2 = new Circle1("도넛", 2.0);
		
		System.out.println( c1.name + ": " + c1.getArea() ); 
		
		

	}

}
