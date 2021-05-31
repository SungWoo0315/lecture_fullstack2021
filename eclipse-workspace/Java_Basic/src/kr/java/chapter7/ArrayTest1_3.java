package kr.java.chapter7;

public class ArrayTest1_3 {

	public static void main(String[] args) {
		// 10개 짜리 문자열 배열
		// 1번
		String[] testArray;
		testArray = new String[10]; // 초기화, null
		
		// System.out.println(testArray[0]);
		
		for(int i = 0; i < testArray.length; i++) {
			testArray[i] = "";
		}
		
		for(int i = 0; i < testArray.length; i++) {
//			System.out.println(testArray[i].concat("    "));
			System.out.println(testArray[i]);
		}

		// Exception
		
		//System.out.println(testArray[0].concat("    "));

		try {
			System.out.println(testArray[0].concat("    "));
			
		} catch (Exception e) {
			System.out.println(e);
//			System.out.println(e.getMessage());
		} finally {
			testArray[0] = "";
			System.out.println("항상 예외처리 후 할 일!!!!");			
		}

		
		for(int i = 0; i < testArray.length; i++) {
			try {
				System.out.println(testArray[i].concat("    "));
				
			} catch (NullPointerException e) {
//				System.out.println(e);
//				System.out.println(e.getMessage());
			}
		}

		
		
		String[] testArray2 = new String[10];
		String testArray3[] = new String[10];
		
		// 2번
		String[] testArray4 = new String[] { 
				"1", "2", "3", "4", "5",
				"6", "7", "8", "9", "10"
				};
		// 3번
		String[] testArray5 = { 
				"1", "2", "3", "4", "5",
				"6", "7", "8", "9", "10"
				};
		
		String[] testArray6 = {};
		
		
		
		
		System.out.println("testArray = " + testArray.length);
		System.out.println("testArray2 = " + testArray2.length);
		System.out.println("testArray3 = " + testArray3.length);
		System.out.println("testArray4 = " + testArray4.length);
		System.out.println("testArray5 = " + testArray5.length);
		System.out.println("testArray6 = " + testArray6.length);
		
		// double 5, 8, 30 개 크기의 배열 3개 만들고, 크기 출력!
		
		double[] doubleArray = new double[5];
		double[] doubleArray2 = {0,0,0,0,0,0,0,0};
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
