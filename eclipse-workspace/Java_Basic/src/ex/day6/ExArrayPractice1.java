package ex.day6;

public class ExArrayPractice1 {

	public static void main(String[] args) {
		/* 다음 같은 정수 배열을 “,” 구분자로 입력받는다. 
		 * 그리고 그 중에서 가장 큰 수를 찾는 프로그램을 작성
		 * [-12, 3, -9, 5, 8, -2, 0, -8, 3, 10]
		 */

		int data[]  = {-12, 3, -9, 5, 8, -2, 0, -8, 3, 10};

		int big = data[0];
		
		for(int i=0; i < data.length; i++) {
			if( (i+1) == data.length) break;
			if(big <= data[i+1]) 
				big = data[i+1];
			
		}
		System.out.println("Big: " + big);
	}

}
