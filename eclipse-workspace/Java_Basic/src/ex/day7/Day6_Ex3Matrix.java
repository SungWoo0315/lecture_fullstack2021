package ex.day7;

import java.util.Scanner;

public class Day6_Ex3Matrix {

	public static void main(String[] args) {
		
		/*
		 * 자연수 n을 입력받아 "출력 예"와 같이 n x n크기에 공백으로 구분하여 출력되는 프로그램을 작성하시오.
		 * 10 미만의 홀수만 출력하시오.
		 * 
		 * 주의! 숫자는 공백으로 구분하되 줄사이에 빈줄은 없다.
		 * 
		 * 강명진 https://minggin.github.io/2021-05/t2
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수를 입력하시오.");
		int n = sc.nextInt();
		int num = 1;
		
		int[][] arr = new int[n][n];
		
			
			for(int i = 0; i<n; i++)
			{
				for(int j = 0; j<n; j++)
				{	
					arr[i][j] = num;
					num = num+2;
					if(num > 10)
						num = 1;
					
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
	}

}
