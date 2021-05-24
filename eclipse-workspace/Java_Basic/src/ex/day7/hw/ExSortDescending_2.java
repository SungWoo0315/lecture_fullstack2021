package ex.day7.hw;

import java.util.Scanner;

// 5/21 과제
/*
 *  10개의 정수 입력받아 배열에 저장 후 내립차순으로 정렬
 */
//https://github.com/nororo29/study_fullstack2021/blob/main/day7/Homework/Practice5.java

public class ExSortDescending_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] intArr = new int[10];
		int temp;

		for (int i = 0; i < 10; i++) {
			intArr[i] = sc.nextInt();
		}

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 9 - i; j++) {
				if (intArr[j] < intArr[j + 1]) {
					temp = intArr[j];
					intArr[j] = intArr[j + 1];
					intArr[j + 1] = temp;
				}
			}
		}

		for (int i : intArr)
			System.out.print(i + " ");
	}

}
