package ex.day6;

public class ExPowTest {

	public static void main(String[] args) {
		
		double sum = 0;
		
		for(int i =1; i < 13; i++) {
			if( i % 3 != 0) continue;
			
			sum += Math.pow(i*2, i);
		}
		System.out.println(sum);
	}

}
