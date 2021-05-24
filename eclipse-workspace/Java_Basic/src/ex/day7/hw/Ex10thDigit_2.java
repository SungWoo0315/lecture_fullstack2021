package ex.day7.hw;

import java.util.Scanner;

// 5/21 과제
/*
 * 100 미만의 양의 정수들이 주어진다.
 * 입력받다가 0이 입력되면 마지막에 입력된 0 을 제외하고
 * 그 때 까지 입력된 정수의 십의자리 숫자가 각각 몇개인지
 * 작은 수부터 출력하는 프로그램을 작성해라. (0은 출력하지 않는다.) 
 */
//https://github.com/nororo29/study_fullstack2021/blob/main/day7/Homework/Practice4.java

public class Ex10thDigit_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] tensDigit = new int[10];

		while (true) {
			int n = sc.nextInt();

			if (n == 0)
				break;
			if (n < 0 || n >= 100)
				continue;

			tensDigit[n / 10]++;
		}

		for (int i = 0; i < 10; i++) {
			if (tensDigit[i] == 0)
				continue;
			System.out.println(i + " : " + tensDigit[i]);
		}

	}

}
