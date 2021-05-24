package ex.day7.hw;

import java.util.Scanner;

// https://github.com/nororo29/study_fullstack2021/blob/main/day7/Homework/Practice1.java
public class ExNumberCharTriangle_1 {

	public static void main(String[] args) {
		// n(3 <= n <= 10) 입력받아 영문자 삼각형 출력
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		char c = 'A';
		
		if (n < 3 || n > 10) {
			System.out.println("숫자 오류");
			return;
		}
		
		for (int i = 0; i < n; i++) {				
			for (int j = 0; j < n - i; j++) {
				if (c == 91)
					c = 'A';
				System.out.print(c);
				c++;
			}
			System.out.println();
		}
	}

}
