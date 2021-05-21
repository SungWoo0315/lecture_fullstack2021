package ex.day7;

import java.util.Scanner;

public class Day6_Ex2Pyramid {

	public static void main(String[] args) {
		
		/*
		 * 자연수 n을 입력받아 "출력 예"와 같이 출력되는 프로그램을 작성하시오.
		 * 주의! '*'과 '*'사이에 공백이 없고 줄사이에도 빈줄이 없다.
		 * 강명진 https://minggin.github.io/2021-05/t2
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하시오.");
		int n = sc.nextInt(); //3
		
		for(int i = n; i >= 1; i--) // 3 2 1 
		{
			for(int j = 0; j < n-i; j++) // 0 < 0, 0 < 1
			{
				System.out.print(" ");
			}
			for(int j = 0; j < i*2-1 ; j++) // 0 < 5
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 2; i <= n; i++)
		{
			for(int j = 0; j < n-i; j++)
			{
				System.out.print(" ");
			}
			for(int j = 0; j < i*2-1 ; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
