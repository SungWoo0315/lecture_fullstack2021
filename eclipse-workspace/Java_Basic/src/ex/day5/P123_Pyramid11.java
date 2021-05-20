package ex.day5;

public class P123_Pyramid11 {

	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 7; j++) {
				if(i == 0) {
					if(j == 3) {
						System.out.print("*");											
					}else {
						System.out.print(" ");
					}
				}else if(i == 1) {
					if(j >= 2 && j <=4) {
						System.out.print("*");						
					}else {
						System.out.print(" ");
					}
				}else if(i == 2) {
					if(j >= 1 && j <=5) {
						System.out.print("*");						
					}else {
						System.out.print(" ");
					}
				}else if(i == 3) {
					System.out.print("*");
				}

			}
			System.out.println("");
		}
	}

}
