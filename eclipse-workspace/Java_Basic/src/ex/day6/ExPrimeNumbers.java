package ex.day6;

import java.util.Scanner;

public class ExPrimeNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 2; i <= n; i++) {
			
			boolean isPrime = true; // 초기 값

			// for(int j=2; j<=i/2; j++) {
			for (int j = 2; j * j <= i; j++) {

				if (i % j == 0) { // 소수가 아니다.
					isPrime = false;
					break;

				}
				if (isPrime) { // 소수 일때만 값을 출력
					System.out.print(i + " ");

				}
				sc.close();
			}
		}
	}
}
