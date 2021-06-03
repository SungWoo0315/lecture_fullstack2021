package ch05;

import review.Student3;

public class InfoHidingEx {

	public static void main(String[] args) {
		// 접근제한자: public > protected > package > private
		
		Student2 st1 = new Student2();
		st1.name = "홍길동";
		st1.address = "";
		
		review.Student2 st2 = new review.Student2();
		//package  의 가시성
		// st2.name = "홍길동";
		// st2.address = "";
		
		
		review.Student3 st3 = new Student3("이름", 0);
	}

}
