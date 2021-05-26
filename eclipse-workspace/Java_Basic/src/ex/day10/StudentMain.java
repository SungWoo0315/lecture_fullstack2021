package ex.day10;

public class StudentMain {

	public static void main(String[] args) {
		Student lee = new Student();
		// 직접 lee.studentName = "홍길동";
		// 간접
		lee.setStudentName("홍길동");
	}

}