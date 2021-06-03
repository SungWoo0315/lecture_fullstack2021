package ch04;

public class ControlExample {

	public static void main(String[] args) {

		int age = 10;

		System.out.println((age >= 6)); // true, false
		System.out.println((age <= 6)); // true, false
		System.out.println((age & 6)); // 값

		if (age >= 6) {
			System.out.println("나이가 " + age);
		}

		if (age < 6) {
			System.out.println("나이가 " + age);
		} else {
			System.out.println("다시...");
		}

		// P95
		char gender = 'F';
		System.out.println((int) gender);

		// F인지?
		if (gender == 'F') {
			System.out.println("여성");
		} else {
			System.out.println("남성");
		}

		//
		if (gender == 70) {
			System.out.println("여성");
		} else {
			System.out.println("남성");
		}

		if (gender != 70) {
			System.out.println("남성");
		} else {
			System.out.println("여성");
		}

		if (gender != 70)
			System.out.println("남성");
		// System.out.println("남성");
		else
			System.out.println("여성");

		if (gender != 70) {
			System.out.println("남성");
			System.out.println("남성");
		} else
			System.out.println("여성");

		// 조건식: 이항 관계연산자: <,>,<=,>=,!=

		// 산술식과 함께는?
		// if( (1 + 1) ) {
		if ((1 + 1) > 0) {
		}

		// 삼항연산자 적용.
		// 조건식 ? 참 : 거짓값. 반환!
		System.out.println((gender != 70 ? "남성" : "여성"));

		// 복합 if-else if-else
		age = 8;
		int charge = 0;

		if (age < 8) {
			charge = 1000;
		} else if (age < 14) {
			charge = 2000;
		} else {
			charge = 2500;
		}

		System.out.println((age < 8 ? 1000 : (age < 14 ? 2000 : 2500)));

		// P100
		int score = 60;
		char grade = 'z';

		if (score > 90) {
			grade = 'A';
		} else if (score > 80) {
			grade = 'B';
		} else if (score > 70) {
			grade = 'C';
		} else if (score > 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		// 엉뚱한.
		score = 80;
		if (score > 60) {
			grade = 'D';
		} else if (score > 70) {
			grade = 'C';
		} else if (score > 80) {
			grade = 'B';
		} else if (score > 90) {
			grade = 'A';
		} else {
			grade = 'F';
		}

		score = 80;
		//
		if (score >= 60 && score <= 69) { // 60보다 크고, 69 작은
			grade = 'D';
		} else if ((score >= 70) && (score <= 79)) { // 79~70
			grade = 'C';
		} else if (score >= 80 && score <= 89) {
			grade = 'B';
		} else if (score >= 90 && score <= 100) {
			grade = 'A';
		} else {
			grade = 'F';
		}
		System.out.println("score: " + score + " -=> " + grade);

		// Nested if
		// 95: A+, 90>: A
		String grd = "";

		if (score >= 90) {
			if (score >= 95) {
				grd = "A+";
			} else {
				grd = "A";
			}
		} else {
			if (score >= 85) {
				grd = "B+";
			} else {
				grd = "B";
			}
		}
		System.out.println("====== switch-case ========");

		// switch-case
		int rank = 100; // 입력된 값.

		switch (rank) { 

		case 10:
			System.out.println("10");
			break;
		case 20:
			break;
		case 30:
			System.out.println("30");
			break;
		case 40:
		case 50: {
			System.out.println("50 50");
			break;
		}
		default: // else
			System.out.println("~~~~ end ~~~~");
		}

		// swith char
		grade = 'D';

		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("AAAAA");
			break;
		case 'B':
		case 'b':
			System.out.println("BBBBBB");
			break;
		default:
			System.out.println("FFFFFFF");
		}

		// jdk1.8 이상.
		String position = "이사";
		switch (position) {
		case "과장":
			break;
		case "차장":
			break;
		case "이사":
			break;
		default:

		}

		// 실습:
		// 현재 월을 알고 있어요. 월의 계절 값을 출력 하도록.
		// 1,2,12: 겨울
		// 3,4,5: 봄
		// 6 7 8: 여름
		// 9 10 11 :가을

		// swich, if
		int month = 2;
		String season = ""; // 봄,여름,가을,겨울.
		
		switch (month) {
		case 1:
		case 2:
		case 12:
			season = "겨울";
			break;
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			break;
		case 9:
		case 10:
		case 11:
			season = "가을";
			break;
		}

		System.out.println(month + "월은 " + season + " 입니다.");

	}

}
