package ex.day5;

public class P123_Gugu {

	public static void main(String[] args) {
		
		for(int i = 1; i < 10; i++) {
			
			System.out.println(i + ": " + (i % 2));
			
			// 홀수인 경우 for문으로 감
			//if((i % 2) == 1) continue; 
			
			if((i % 2) == 0 ) {
				for(int j = 1; j < 10; j++) { 
					// 구구단 출력
					System.out.println(i + " * " + j + " = " + (i*j)); 
				}				
			}

			
			System.out.println("============");
		}
	}

}
