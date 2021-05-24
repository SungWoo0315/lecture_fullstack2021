package ex.day7.hw;

import java.util.Scanner;
/*
 * 5/21과제
 * 
 */
//https://github.com/spada9403/Study/blob/main/kosmo/src/com/osh/Day8_0521_Homework/NumberStairs.java

public class ExNumberTriangle {

	public static void main(String[] args) {
		// 자연수 n입력받아 숫자 삼각형 출력
		// 숫자사이 공백으로 구분
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int printNum = 1;
			
			for (int z = n - 1 - i; z > 0; z--) {
				System.out.print("  ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print(printNum + " ");
				printNum++;
			}
			
			System.out.println();
		}
	}

}
