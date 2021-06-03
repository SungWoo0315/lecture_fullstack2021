package ch06;

public class StudentStatic {
	// package modifier
	public static int count = 0;
	
	private String name;
	private int grade;
	private int money;

	public StudentStatic() {
		this("", 0);
	}

	public StudentStatic(String name, int money) {
		this.money = money;
		this.name = name;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000); 	// 공통화 대상
		this.money -= 1000;
	}

	public void takeSubway(Subway subway) {
		subway.take(1500);	// 공통화 대상
		this.money -= 1500;
	}

	public void showInfo() {
		System.out.println(this.name + "님의 남은 돈은 " + money + "입니다.");
	}
	
	public static int getCount() {
		//return this.count;
//		return count; 
		return StudentStatic.count;
	}
	
	public static void setCount(int i) {
		//name = "";
		StudentStatic.count += i;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
