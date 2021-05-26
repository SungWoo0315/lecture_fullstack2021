package kr.java.chapter6;
/*
 * 생성자, this, this() 연습
 */
public class Person1 {
	
	String name;
	int age;
	String job;
	String blood;
	String gender;
		
	Person1(){
		//this("이름없음", 0);	
		this("이름없음", 0, "", "", "직업없음");
	}
	
	/* Person1(String name, int age){
		this.name = name;
		this.age = age;
		// job.. bllo...
	} */

	Person1(String name, int age){
		this(name, age, "", "", "직업없음");
	}
	
	Person1(String name, int age, String gd, String bl, String j){
		this.name = name;
		this.age = age;
		this.gender = gd;
		this.blood = bl;
		this.job = j;
	}
	
	public void play() {
		String play = "";
		if(this.job.equals("의사")) {
			play = "진료한다";
		} else {
			play = " ... ";
		}
		System.out.println(this.job + "는 " + play);
	}

}
