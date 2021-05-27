package kr.java.chapter8;

public class ExP278Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Employee {
	String name;
	String grade;
	
	public Employee(String n) {
		this.name = n;
	}
}


class Engineer extends Employee {

	public Engineer(String n) {
		super(n);
	}
	
}
