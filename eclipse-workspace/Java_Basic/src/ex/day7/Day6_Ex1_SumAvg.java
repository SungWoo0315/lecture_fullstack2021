package ex.day7;

import java.util.Scanner;

public class Day6_Ex1_SumAvg {

	public static void main(String[] args) {
		
		/*
		 * 자연수 n을 입력받고 1부터 홀수를 차례대로 더해 나가면서 
		 * 합이 n 이상이면 그 때까지 더해진 홀수의 개수와 그 합을 
		 * 출력하는 프로그램을 작성하시오.
		 * 
		 * 황지현 
		 * https://github.com/nororo29/study_fullstack2021/blob/main/day6/Practice0520_1.java
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("자연수를 입력하세요" );

		int n = sc.nextInt();
		int oddNum = 0;
		int oddSum = 0;
		
		for (int i = 1; i <= n; i += 2) { //
			oddSum += i;
			oddNum++;
			if (oddSum >= n) {
				System.out.println("더해진 홀수 개수 : " + oddNum);
				System.out.println("더해진 홀수 합 : " + oddSum);
				break;
			}
		}
		
		
		/*Scanner sc = new Scanner(System.in);
		
		System.out.println("자연수를 입력하시오.");
		int n = sc.nextInt();
		int sum = 0;
		int cnt = 0;
		
		for(int i = 0; i<=n; i++)
		{
			if(i%2 == 1)
			{
				sum += i;
				cnt ++;
			}
		}
		System.out.println("합 : " + sum);
		System.out.println("개수 : " + cnt);*/
	}

}
