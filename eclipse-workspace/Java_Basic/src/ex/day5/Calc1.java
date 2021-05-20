package ex.day5;

import java.util.Scanner;

public class Calc1 {

	public static void main(String[] args) {
		/*사칙연산을 Scanner 입력으로 구현한다. ​
		 *  - 피연산자 -> 연산자 -> 피연산자 순서로 입력받아 결과를 출력한다.​
		 *  예)​
			> 계산식을 차례로 입력하세요.(피연산자->연산자->피연산자)​
			피연산자:10​
			연산자: +​
			피연산자:20​
			결과: 3
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자1");
		int num1 = sc.nextInt();
		System.out.println("연산자");
		char operator = sc.next().charAt(0);
		System.out.println("숫자2");
		int num2 = sc.nextInt();
		
		switch(operator) {
		case '+': {
			System.out.println("결과 : "+(num1 + num2));
			break;
		}
		case '-': {
			System.out.println("결과 : "+(num1 - num2));
			break;
		}
		case '*': {
			System.out.println("결과 : "+(num1 * num2));
			break;
		}
		case '/': {
			System.out.println("결과 : "+(num1 / num2));
			break;
		}
		
		}
	}
}
