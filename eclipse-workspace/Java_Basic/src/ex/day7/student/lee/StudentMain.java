package ex.day7.student.lee;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s;
		String[] str;
		Student[] student = new Student[10];
		int m_total = 0;
		int s_total = 0;
		int e_total = 0;
		
		int m_avg = 0;
		int s_avg = 0;
		int e_avg = 0;
		
		
		for(int i=0; i<10; i++) {
			s = sc.nextLine();
			str = s.split("/");
			
			if("/sum".equals(s)) {
				for(int j=0; j<i; j++) {
					m_total += student[j].subj[0].score;
					s_total += student[j].subj[1].score;
					e_total += student[j].subj[2].score;
					m_avg = m_total/i;
					m_avg = m_total/i;
					m_avg = m_total/i;
				}
				break;
			}
			System.out.println(i+1 + "/10");
			
			student[i] = new Student(); 
			student[i].studentName = str[0];
			student[i].grede = Integer.parseInt(str[1]);
			student[i].address = str[2];
			student[i].subj = new Score[3];
			
			student[i].subj[0] = new Score();
			student[i].subj[0].subject = "수학";
			student[i].subj[0].score = Integer.parseInt(str[3]);
			
			student[i].subj[1] = new Score();
			student[i].subj[1].subject = "과학";
			student[i].subj[1].score = Integer.parseInt(str[4]);
			
			student[i].subj[2] = new Score();
			student[i].subj[2].subject = "영어";
			student[i].subj[2].score = Integer.parseInt(str[5]);
			
		}
			
			
			System.out.println("수학 : "+m_total+", 평균:"+m_avg);
			System.out.println("과학 : "+s_total+", 평균:"+s_avg);
			System.out.println("영어 : "+e_total+", 평균:"+e_avg);
		
		
	}

}
