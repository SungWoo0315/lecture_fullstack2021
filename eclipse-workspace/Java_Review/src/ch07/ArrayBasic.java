package ch07;

public class ArrayBasic {

	public static void main(String[] args) {
		// 배열
		// 자료를 순차적 배치.
		// -> index 
		// 2차원: 세로 축: column(열), 가로 축: row (행)
		//	-> 1행 짜리 자료.
		
		// 연산자 []
		int[] studentIds = new int[] {101, 102, 103};
		int[] studentIds2 = {101, 102, 103};
		int[] studentIds3 = new int[100];
		int[] studentIds4;
		studentIds4 = new int[] {101, 102, 103};

		System.out.println(studentIds.length);
		System.out.println(studentIds);
		System.out.println(studentIds3.length);
		System.out.println(studentIds3);
		
		// 배열 인덱스 사용: 0~length-1
		System.out.println(studentIds[0]);
		System.out.println(studentIds3[99]);

		System.out.println(studentIds[studentIds.length-1]);

		// Out of Index
		// System.out.println(studentIds[studentIds.length]); // index 3
		
		// 예외 처리
		// 1. 인덱스 범위 고치거나.
		// 2. ArrayOutOfBoundException 처리
		//System.out.println(studentIds[studentIds.length]); // index 3			

		try {
			System.out.println(studentIds[studentIds.length]); // index 3			
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println(e.getMessage());
			// 후속조치!
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
		
		// int[] studentIds = new int[] {101, 102, 103};
		//int[] studentIds2 = {101, 102, 103};
		//int[] studentIds3 = new int[100];
		
		studentIds[1] = -100;
		studentIds3[80] = 10;
		System.out.println("studentIds[1]:" + studentIds[1]
				+ " studentIds3[80]: " + studentIds3[80]);
		
		//studentIds[5] = -100;
		for(int i = 0; i < studentIds3.length; i++) {
			System.out.printf("studentIds3[%d]:%d\n", i, studentIds3[i]); 
		}
		// for each 향상된 for문
		//   - 컬렉션 객체 자체.
		// for( element(요소): 컬렉션 ) { 코드브럭 }
		for(int a : studentIds3) {
			System.out.println(a); 
		}
		
		int count = 0;
		for(int a : studentIds3) {
			System.out.println(a); 
			count++;
		}
		
		// 문자열 배열.
		String[] messages = new String[5]; // null
		for(String s : messages) {
			System.out.println(s);
		}
		//
		for(int i=0; i < messages.length; i++) {
			messages[i] = "";//new String();
		}
		
		ArrayBasic[] basics = new ArrayBasic[5]; // null
		for(ArrayBasic a : basics) {
			System.out.println(a);
		}
		
		System.out.println(messages);
		System.out.println(basics);

		// arraycopy() 배열 복사
		// 10개 배열을 20개 배열로 복사.
		int[] numbers1 = new int[] {0,1,2,3,4,5,6,7,8,9};
		int[] numbers2 = new int[20];
		
		// number1 -> number2 복사
		// numbers2 : 0~10
		System.arraycopy(numbers1, 0, numbers2, 0, numbers1.length);
		for(int i : numbers2) {
			System.out.print(i + " ");
		}
		// numbers2 : 11~19
		System.arraycopy(numbers1, 0, numbers2, 10, numbers1.length);
		for(int i : numbers2) {
			System.out.print(i + " ");
		}
		// for 반복문으로 number1 -> number2 복사
		// 작은 배열을 기준.
		for(int i=0; i < numbers1.length; i++) {
			numbers2[i] = numbers1[i];
		}
		// numbers2 : 11~19
		for(int i=10; i < numbers1.length; i++) {
			numbers2[i] = numbers1[i];
		}
		
		// sum() 메서드 사용.
		ArrayBasic ex = new ArrayBasic();
		int sum = ex.sum(numbers1);
		System.out.println(sum);

		
	}
	
	// array는 길이를 알 수 없는 int형 배열입니다.
    // 변수 sum에 array의 모든 값을 더해보세요.
	// 다음 메서드를 완성하시오.
	int sum(int[] array) {
		int sum = 0;
		for(int i : array)
			sum += i;
		return sum;
		
	}
	
	
	
	
	

}
