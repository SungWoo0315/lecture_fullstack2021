package ex.day8;

import java.util.Scanner;

public class ExMorseCode_pk {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 모스부호

		String str;

		System.out.println("입력해주세요.");
		str = sc.nextLine();

		for (int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {
			case 'A':
			case 'a':
				System.out.print(".- ");
				break;
			case 'B':
			case 'b':
				System.out.print("-... ");
				break;
			case 'C':
			case 'c':
				System.out.print("-.-. ");
				break;
			case 'D':
			case 'd':
				System.out.print("-.. ");
				break;
			case 'E':
			case 'e':
				System.out.print(". ");
				break;
			case 'F':
			case 'f':
				System.out.print("..-. ");
				break;
			case 'G':
			case 'g':
				System.out.print("--. ");
				break;
			case 'H':
			case 'h':
				System.out.print(".... ");
				break;
			case 'I':
			case 'i':
				System.out.print(".. ");
				break;
			case 'J':
			case 'j':
				System.out.print(".--- ");
				break;
			case 'K':
			case 'k':
				System.out.print("-.- ");
				break;
			case 'L':
			case 'l':
				System.out.print(".-.. ");
				break;
			case 'M':
			case 'm':
				System.out.print("-- ");
				break;
			case 'N':
			case 'n':
				System.out.print("-. ");
				break;
			case 'O':
			case 'o':
				System.out.print("--- ");
				break;
			case 'P':
			case 'p':
				System.out.print(".--. ");
				break;
			case 'Q':
			case 'q':
				System.out.print("--.- ");
				break;
			case 'R':
			case 'r':
				System.out.print(".-. ");
				break;
			case 'S':
			case 's':
				System.out.print("... ");
				break;
			case 'T':
			case 't':
				System.out.print("- ");
				break;
			case 'U':
			case 'u':
				System.out.print("..- ");
				break;
			case 'V':
			case 'v':
				System.out.print("...- ");
				break;
			case 'W':
			case 'w':
				System.out.print(".-- ");
				break;
			case 'X':
			case 'x':
				System.out.print("-..- ");
				break;
			case 'Y':
			case 'y':
				System.out.print("-.-- ");
				break;
			case 'Z':
			case 'z':
				System.out.print("--.. ");
				break;
			}
		}

	}

}
