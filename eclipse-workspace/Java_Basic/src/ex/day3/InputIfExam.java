package ex.day3;

import java.util.Scanner;

public class InputIfExam {

	public static void main(String[] args) {

		// 실습:
		// 숫자가 0, 부호- 가 아니면 숫자를 출력!
		// 0, 부호-면 경고 메시지 "양수를 입력하세요!" 출력!
		// Scanner, if statement 사용:

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요: ");
		String str = scanner.nextLine();
		
		int num1 = Integer.parseInt(str);
		
		if( (num1 == 0) || (num1 < 0) ) {
			System.out.println("0 혹은 음수!!");
		}
	
		else {
			System.out.println("숫자: " + num1);
		}
		

		
	}

}
