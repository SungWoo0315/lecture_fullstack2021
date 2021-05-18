package kr.java.chaper4;

public class IfStatementExam {

	public static void main(String[] args) {

		int age = 10;
		
		// 조건1
		if( age >= 8 ) 
		{   // 조건식!
			System.out.println("8살 이상이네요.");
		}
		else {	 // 조건이 false 인경우.
			System.out.println("8살 이하!!!");
		}
		
		// 복합 조건;
		int age2 = 10;
		// age1 8살 이상이고 age2 10 보다 큰거.
		
		// if( age >= 8 && age2 > 10 ) 
		if( (age >= 8) && (age2 > 10) ) 
		{   // 조건식!
			System.out.println("8살 이상이네요.");
		}
		else {	 // 조건이 false 인경우.
			System.out.println("8살 이하!!!");
		}
		

		// 60점 이상 -> 합격
		// 60점 미만 -> 불합겹
		
		int score = -1;
		//1. 
		if( score >= 60 ) {
			// 60점 이상 -> 합격
		}
		if( score < 60) {
			// 60점 미만 -> 불합겹
		}
		
		//2.
		if( score >= 60 ) {
			//60점 이상 -> 합격
		} else {
			// 60점 마만 -> 불합겹
		}
		
		//3.if-else, if-else
		if( score >= 60 ) {
			// 60점 이상 -> 합격
		} else if ( score >= 50) {
			// 50점 미만 -> 불합겹
		} else if ( score >= 40) {
			// 40점 미만 -> 불합겹
		} else {
			//
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
