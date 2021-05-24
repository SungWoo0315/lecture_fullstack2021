package ex.day7.student.kk;

import java.util.Scanner;

//
// https://github.com/MingGin/MingGin.github.io/blob/master/_posts/05-21%EC%8B%A4%EC%8A%B5.java
public class StudentTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[10];
		
		int mathSum = 0;
		int sciSum = 0;
		int engSum = 0;
		int avg = 0;
		int cnt = 0;
		
		Student2 students[] = new Student2[10];
		
		
		for(int i = 0; i<10; i++)
		{
			
			System.out.println("학생 성적을 입력하세요. (이름/학년/주소/수학/과학/영어)");
			String result = sc.nextLine();
			
			if(result.equals("/sum")) {
				System.out.println("수학: " + mathSum + "/" + mathSum / cnt);
				System.out.println("과학: " + sciSum + "/" + sciSum / cnt);
				System.out.println("영어: " + engSum + "/" + engSum / cnt);
				break;
			}
			
			name [i] = result;
			String[] data = name[i].split("/");
			students[i] = new Student2();
			students[i].studentName = data[0];
			students[i].grade = Integer.parseInt(data[1]);
			students[i].address = data[2];
			
			students[i].subj = new Score2[3];
			for(int j = 0; j<3; j++)
			{
				students[i].subj[j] = new Score2();
				students[i].subj[j].subject = data[3+j];
				students[i].subj[j].score = Integer.parseInt(data[3+j]);
			}
			
			
			System.out.println(i+1+"/10");
			mathSum += Integer.parseInt(data[3]);
			sciSum += Integer.parseInt(data[4]);
			engSum += Integer.parseInt(data[5]);
				
			System.out.println();
			cnt++;

			
		}
	}

}