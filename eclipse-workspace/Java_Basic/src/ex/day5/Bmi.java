package ex.day5;

import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {
		/*“몸무게+100-키” 가 비만공식 이라고 한다.​
		 * 키와 몸무게/ 키 를 자연수로 입력 받는다. 비만수치가 0보다 크면 “비만” 출력한다. 출력시 “비만수치  비만” 형식으로 출력한다.​
		 * 출력후 다시 입력을 시작한다.​
		 * 문자 q 입력되면 종료
		 */
Scanner sc = new Scanner(System.in);
		
		String weight;
		String hight;
		int fatness;
		String result;
		
		while(true) {
			System.out.println("몸무게를 입력하세요.");
			weight = sc.nextLine();
			if(weight.equals("q") || weight.equals("-1")) {
				System.out.println("종료합니다.");
				break;
			}			

			System.out.println("키를 입력하세요.");
			hight = sc.nextLine();
			if(hight.equals("q")||weight.equals("-1")) {
				System.out.println("종료합니다.");
				break;
			}
			
			fatness = Integer.parseInt(weight) + 100 - Integer.parseInt(hight);
			
			if (fatness > 0) {
				System.out.println(fatness + "비만");
			}			
		}
	}
}
