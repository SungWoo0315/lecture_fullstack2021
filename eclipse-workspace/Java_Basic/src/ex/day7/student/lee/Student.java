package ex.day7.student.lee;

import java.util.Arrays;

public class Student {
	// 멤버 필드 (변수, 식별자)
	int studentId;
	String studentName;
	int grede;
	String address;

	// 과목별 점수 : 과목 + 점수
	Score[] subj;

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", grede=" + grede + ", address="
				+ address + ", subj=" + Arrays.toString(subj) + "]";
	}

}