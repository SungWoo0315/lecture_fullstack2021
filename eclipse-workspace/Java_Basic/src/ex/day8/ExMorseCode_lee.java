package ex.day8;

import java.util.Scanner;

public class ExMorseCode_lee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문장, 문자를 입력해주세요.");
		String[] str = sc.nextLine().split(""); //

		String result = "";
		for (int i = 0; i < str.length; i++) {

			if ("A".equalsIgnoreCase(str[i])) {
				result += ".- ";
			} else if ("B".equalsIgnoreCase(str[i])) {
				result += "-... ";
			} else if ("C".equalsIgnoreCase(str[i])) {
				result += "-.-. ";
			} else if ("D".equalsIgnoreCase(str[i])) {
				result += "-.. ";
			} else if ("E".equalsIgnoreCase(str[i])) {
				result += ". ";
			} else if ("F".equalsIgnoreCase(str[i])) {
				result += "..-. ";
			} else if ("G".equalsIgnoreCase(str[i])) {
				result += "--. ";
			} else if ("H".equalsIgnoreCase(str[i])) {
				result += ".... ";
			} else if ("I".equalsIgnoreCase(str[i])) {
				result += ".. ";
			} else if ("J".equalsIgnoreCase(str[i])) {
				result += ".--- ";
			} else if ("K".equalsIgnoreCase(str[i])) {
				result += "-.- ";
			} else if ("L".equalsIgnoreCase(str[i])) {
				result += ".-.. ";
			} else if ("M".equalsIgnoreCase(str[i])) {
				result += "-- ";
			} else if ("N".equalsIgnoreCase(str[i])) {
				result += "-. ";
			} else if ("O".equalsIgnoreCase(str[i])) {
				result += "--- ";
			} else if ("P".equalsIgnoreCase(str[i])) {
				result += ".--. ";
			} else if ("Q".equalsIgnoreCase(str[i])) {
				result += "--.- ";
			} else if ("R".equalsIgnoreCase(str[i])) {
				result += ".-. ";
			} else if ("S".equalsIgnoreCase(str[i])) {
				result += "... ";
			} else if ("T".equalsIgnoreCase(str[i])) {
				result += "- ";
			} else if ("U".equalsIgnoreCase(str[i])) {
				result += "..- ";
			} else if ("V".equalsIgnoreCase(str[i])) {
				result += "...- ";
			} else if ("W".equalsIgnoreCase(str[i])) {
				result += ".-- ";
			} else if ("X".equalsIgnoreCase(str[i])) {
				result += "-..- ";
			} else if ("Y".equalsIgnoreCase(str[i])) {
				result += "-.-- ";
			} else if ("Z".equalsIgnoreCase(str[i])) {
				result += "--.. ";
			}
		}
		System.out.println(result);

	}

}
