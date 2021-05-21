package kr.java.chapter7;

import java.util.Scanner;

public class ArrayTest4 {

	public static void main(String[] args) {
		/*
		 * 어떤 학교의 학생 과학/수학 시험 성적을 “학생/점수/점수” 순서로  
		 * 되었다. 학생이름이 ‘홍‘ 으로 시작하는 학생의 성적만 찾아 출력하시오.

		 */
		Scanner sc = new Scanner(System.in);
		String student[] = new String[5];
		int math = 0;
		int sci = 0;

		int find_id = -1;
		
		for (int i = 0; i < student.length; i++) {
			System.out.println("이름/과학/수학 점수를 입력해주세요.");
			student[i] = sc.next();
			String person = student[i];
				
			String[] data = person.split("/");
			// 학생 찾기
			if( data[0].contains("홍")) {
				 find_id = i;
				 break;
			}
			
			math += Integer.parseInt(data[1]);

			sci += Integer.parseInt(data[2]);
		}
		System.out.println("--------------");
		System.out.println("과학 : " + sci + "/" + sci / student.length);
		System.out.println("수학 : " + math + "/" + math / student.length);
	}

}
