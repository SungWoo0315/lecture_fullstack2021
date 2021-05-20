package ex.day5;

import java.util.Scanner;

public class P106_ElevatorButton {

	public static void main(String[] args) {
		/*나 혼자 코딩 100p - 성적에 따라 학점을 부여
		 * 
		 * 100 ~ 90 A
		 * 89 ~ 80 B
		 * 79 ~ 70 C
		 * 69 ~ 60 D
		 * ~ F
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력해주세요.");
		
		int score = sc.nextInt(); //점수
		char grade; //등급
		//String grade = new String();
		//String grade = "";
		
		
		if (score >= 90) {
			grade = 'A'; // grade = "A";
		}else if( (score < 90) && score >=80) {
			grade = 'B';
		}else if(score < 80 && score >=70) {
			grade = 'C';
		}else if(score < 70 && score >=60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		System.out.println(grade);
	}

}
