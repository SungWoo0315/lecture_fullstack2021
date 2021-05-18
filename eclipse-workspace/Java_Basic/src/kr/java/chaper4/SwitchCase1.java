package kr.java.chaper4;

public class SwitchCase1 {

	public static void main(String[] args) {

		int rank = 5;
		char medalColor = 'A';
		
		switch(rank){
		
			case 1: medalColor = 'G';
				break;
				
			case 2: medalColor = 'S';
				break;
			
			case 3: medalColor = 'B';
				break;
		}		
		System.out.println(rank + "�� �޴��� ������ " + medalColor + " �Դϴ�.");
	}
}
