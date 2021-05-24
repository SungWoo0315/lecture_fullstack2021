package ex.day8;

import java.util.Scanner;

public class ExPetNames {

	public static void main(String[] args) {

		// 박태경
		// https://github.com/tae1296/github-practice/blob/main/may/5.24/
		Scanner sc =new Scanner(System.in);
		
		String[] nick= {"White", "Black", "Bear", "Sesame", "Gift"};
		String[] name= {"흰둥이", "까만콩",  "곰돌이", "깨소금","복돌이"};
		
		System.out.println("강아지 이름을 입력해주세요");
		String str=sc.nextLine();
		
		int pos = -1;
		
		for(int i=0; i<5; i++) {

			if(str.equals(name[i])) {
				pos = i;
//				 break;
			}else {
				System.out.println("등록되지 않았습니다.");
//				break;
			}
		}
		
		System.out.println("> "+nick[pos]);

		
	}

}
