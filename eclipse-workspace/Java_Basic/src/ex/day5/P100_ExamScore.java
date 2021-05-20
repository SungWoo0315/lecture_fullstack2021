package ex.day5;

import java.util.Scanner;

public class P100_ExamScore {

	public static void main(String[] args) {
		/*
		 * 106p 1층 약귝 2층 정형외과 3층 피부과 4층 치과 5층 헬스클럽
		 * switch-case 이용
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("몇 층을 가시겠습니까?");
		//int floor = sc.nextInt();
		// "1층"
		String floor = sc.next();

		switch(floor) {
		case "1층":
			System.out.println("1층 약국입니다.");
			break;	
		case "2층":
			System.out.println("2층 입니다.");
			break;
		default:
			break;
		}
		
		/* switch (floor) {
		case 1: {
			System.out.println("1층 약국입니다.");
			break;
		}
		case 2: {
			System.out.println("2층 정형외과입니다.");
			break;
		}
		case 3: {
			System.out.println("3층 피부과입니다.");
			break;
		}
		case 4: {
			System.out.println("4층 치과입니다.");
			break;
		}
		case 5: {
			System.out.println("5층 헬스클럽입니다.");
			break;
		}
		}*/
	}
}
