package kr.java.chapter8.inherit;

public class Car {
	
	protected int cc; // 배기량
	protected String name;
	
	public Car() {
		this("이름없음", 0);
	}
	
	public Car(String name, int cc){
		this.name = name;
		this.cc = cc;
	}

	public void run() {
		System.out.println(this.name + " 달린다!");
	}
}
