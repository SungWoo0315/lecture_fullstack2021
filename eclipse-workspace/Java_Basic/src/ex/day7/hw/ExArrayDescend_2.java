package ex.day7.hw;

import java.util.Scanner;

// 5/21 과제
/*
 * 100 개의 정수를 저장할수 있는 배열을 선언하고 정수를 차례대로 입력받다가 0 이 입력되면
 * 0을 제외하고 그 떄 까지 입력된 정수를 가장 나중에 입력된 정수부터 차례대로 출력하는 프로그램.
 */
//https://github.com/nororo29/study_fullstack2021/blob/main/day7/Homework/Practice3.java
public class ExArrayDescend_2 {

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
