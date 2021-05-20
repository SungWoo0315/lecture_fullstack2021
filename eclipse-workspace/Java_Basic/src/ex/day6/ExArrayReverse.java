package ex.day6;

import java.util.Arrays;

public class ExArrayReverse {

	public static void main(String[] args) {
		/**
		 * 10개의 문자를 입력 받아 마지막으로 입력 받은 문자부터 
		 * 첫 번째 입력 받은 문자까지 차례로 출력하는 프로그램을 작성 하시오.
		 * 
		 * https://github.com/Edonghee/2021study/blob/main/0520/%EC%88%98%EC%97%85%EB%95%8C%20%ED%95%9C%EA%B1%B0/ArraySort.java
		 */

		String[] str = { "A", "E", "C", "X", "Y", "Z", "c", "b", "z", "e" };

		String tmp;
		for (int i = 0; i < str.length / 2; i++) {
			tmp = str[str.length - 1 - i];
			str[str.length - 1 - i] = str[i];
			str[i] = tmp;
		}
		System.out.println(Arrays.toString(str));
	}

}
