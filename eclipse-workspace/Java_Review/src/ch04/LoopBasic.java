package ch04;

public class LoopBasic {
	
	public static void main(String[] args) {
		
		// while(조건식) { 코드블럭 }
		
		// 1~10 자연수를 각각 더해서 합을 출력.
		
		int num = 1;
		int sum = 0;
		
		while( num <= 10 ) { //num 증가 + 1
			sum = num + sum;
			// sum += num;
			
			// 마지막
			// 전위 
			++num;
			// num = num + 1;
			// num += 1;
			
			// 후위
			// num++;
		}
		System.out.println("1...10까지 합: " + sum);
		
		//  1..10까지 수에서 짝수인 경우만 합.
		num = 1;
		sum = 0;
		while( num <= 10) {
			// 짝수인지?
			if( num % 2 == 0) {
				sum += num;
			}
			// 마직막
			num++;
		}

		
		// do while
		
		num = 1;
		sum = 0;
		
		do {
			sum += num;
			num++;
		} while( num <= 10);
		
		System.out.println("1...10까지 합: " + sum);

		num = 1;
		sum = 0;
		
		do {
			sum += num;
			num++;
		} while( num > 2);
		
		System.out.println("1...10까지 합: " + sum);

		// for
		// for( 초기화식; 조건식; 증감식) {코드블럭}
		// 각각의 index++
		
		// for( ; 조건식; 증감식) {코드블럭}
		// for( ; ; 증감식) {코드블럭}
		// for( 초기화; 조건식; ) {코드블럭}
		// for( ; ; ) {코드블럭}
		//   ---> while() 
		
		
		// int num2;
		for( int num2 = 1; num <= 5; num++) {
			
		}
		// 문자형 a-z 출력하시오.
		char ch;
		for(int c = 63; c < 90; c++) {
			System.out.println((char)c);
		}
		// 1..10 까지 수에서 짝수인 경우만 합.
		sum = 0;
		for(int i = 1; i <= 10; i++) {
			// 짝수인지?
			if( i % 2 == 0) {
				sum += i;
			}
		}
		
		for(byte b = 0; b < 127; b++) {
		}
		for(float f = 0; f < 100.0; f++) {}
		
		// 중첩된 반복문!
		while( num < 10) {
			while( num % 2 == 0) {
				//
			}
			num++;
		}
		
		for(int d = 2; d <= 9; d++) {
			for(int i = 1; i <= 9; i++) {
				System.out.println( d + " x " + i + " = " + (d * i));
				System.out.printf( "%d x %d = %d", d, i, d * i);
			}
		}
		
		// continue
		// 반복중 코드블럭 안에서 어떤 조건인 경우 처음 반복으로 돌아가는거.
		// 1...100 사이 홀수만 합!
		sum = 0;
		for(int i = 0; i <= 100; i++) {
			// 짝수 -> 다시 반복으로 돌아감.
			if( i % 2 == 0) {
				continue;
			}
			sum += i;
		}
		
		// break;
		sum = 0;
		for(int i = 0; i <= 100; i++) {
			// 짝수 -> 다시 반복으로 돌아감.
			if( i == 55) {
				break;
			}
			sum += i;
		}
		
		for(int d = 2; d <= 100; d++) {
			for(int i = 1; i <= 100; i++) {
				if( d == 55) {
					break;
				}
				System.out.println( d + " x " + i + " = " + (d * i));
				System.out.printf( "%d x %d = %d", d, i, d * i);
			}
		}
		
		
		
		
		// for each 향상된 for문
		//   - 컬렉션 객체 자체.
		// for( element(요소): 컬렉션 ) { 코드브럭 }

		
		
		
		// while -> Loop  만들때 거의 사용!
		//while(true) {
			// 조건...
		//}
	}

}
