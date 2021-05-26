package ex.day10;


// class 지시자 : 클래스의 코드를 정의 하는 곳!
public class Student {  
	
	
	private String studentName;
	private int grade;
	
	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getScore() {
		return score;
	}

	public void setScore2(int s) {
		score = s;
	}
	
	
	protected String address;
	
	int studentId;

	public int score;

	
	public String showStudentInfo() {
		// 이름/아이디/주소
		String info = studentName + "/" + studentId + "/" + address;
		return info;
	}
	

	public void println() {
		String info = studentName + "/" + studentId + "/" + address;
		System.out.println(info);
	}

	public String setScore(int score) {
		score = score;
		String info = showStudentInfo();
		return info + " / score=" + score;
	}
	
	
}










