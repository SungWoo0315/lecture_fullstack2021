package ex.day8;

import java.util.Arrays;
import java.util.Scanner;

public class ExPetNames2 {

	public static void main(String[] args) {

		// 오세황
		// https://github.com/spada9403/Study/blob/main/kosmo/src/com/osh/m5d24/StringMatch.java		
		
		Scanner sc = new Scanner(System.in);
		
		String[] PetName = new String[] {"곰돌이","복돌이","흰둥이","깨소금","까만콩"};
		String[] NickName = new String[] {"Bear","Gift","White","Sesami","Black"};
		
		// ['ㅇㅇㅇ','ㅇㅇㅇ']
		System.out.println("애완견 이름을 입력해주세요.");
		String input = sc.nextLine();
		
		for(String name:PetName) {
			if(name.equals(input)) {
				System.out.println(
						NickName[Arrays.asList(PetName).indexOf(name)]);
				break;
			}
		}
	}

}
