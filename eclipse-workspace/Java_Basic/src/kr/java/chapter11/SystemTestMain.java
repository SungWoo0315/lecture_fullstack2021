package kr.java.chapter11;

import java.util.Properties;

public class SystemTestMain {

	public static void main(String[] args) {

		// ... 끝내고자 하실때!
		//System.exit(0);
		//System.out.println();
		//시작 시점 시간!
		long start = System.nanoTime();
		
		// 동작
		int sum = 0;
		for(int i =0; i <= 100000000; i++) {
			sum += 1;
		}
		
		//끝 시점 시간.
		long end = System.nanoTime();
		
		System.out.println("합: " + sum);
		System.out.println("시간: " + (end - start));		
		
	}

}
