package ch10;

public class Student {
	// package modifier
	private String name;
	private int grade;
	private int money;

	public Student() {
		this("", 0);
	}

	public Student(String name, int money) {
		this.money = money;
		this.name = name;
	}
	// 인터페이스
	public void takeBus(Take t) {
		t.take(1000); 	// 공통화 대상
		this.money -= 1000;
	}

	public void takeSubway(Take t) {
		t.take(1500);	// 공통화 대상
		this.money -= 1500;
	}

	public void showInfo() {
		System.out.println(this.name + "님의 남은 돈은 " + money + "입니다.");
	}
}
