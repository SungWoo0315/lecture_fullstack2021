package ex.day6;

import java.util.Scanner;

public class ExPrimeNumbers2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		System.out.println("확인할 범위를 입력해주세요");
		int last=sc.nextInt();
	
		for(int i=2;i<=last;i++) {
			if(i!=2 && i%2==0) {
				
			}else if(i!=3 && i%3==0) {

			}else if(i!=5 && i%5==0) {

			}else if(i!=7 && i%7==0) {
				
			}else {
				System.out.print(i+" ");
			}
		}
		
	}
}
