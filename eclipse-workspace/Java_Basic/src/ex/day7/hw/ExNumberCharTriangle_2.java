package ex.day7.hw;

import java.util.Scanner;

/*
 * 5/21 과제
 */
// https://github.com/spada9403/Study/blob/main/kosmo/src/com/osh/Day8_0521_Homework/CharPyramid.java
public class ExNumberCharTriangle_2 {

	public static void main(String[] args) {
		// n(3 <= n <= 10) 입력받아 영문자 삼각형 출력
		Scanner sc = new Scanner(System.in);
		
		//자연수 n 입력받기
		System.out.println("자연수 3~ 10을 입력해주세요.");
		int n = sc.nextInt();
		
		//알파벳 시작점 설정.
		char alphabet = 'A';
		
		// 줄반복.
		for(int i = n; i > 0; i--) {
			//자연수 범위 검증
			if((n < 3) || (n >10)) {
				System.out.println("입력한 자연수는 범위를 벗어났습니다.");
				break;
			}
			//알파벳 피라미드
			//입력받은 자연수 n만틈 반복.
			for(int j = i; j >= 1; j--) {
				System.out.print(alphabet);
				alphabet++;
				// Z를 넘어가면 다시 A로
				if(alphabet == 'Z'+1) alphabet = 'A';
			}
			System.out.println();
		}
	}

}
