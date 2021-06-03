package ch05;

public class InstanceReference2 {

	class Student {
		int id;
		String name;
		int grade;
	}
	
	public static void main(String[] args) {
		
		InstanceReference2 main = new InstanceReference2();
		Student st1 = main.new Student();
		Student st2 = main.new Student();
		Student st3 = main.new Student();
		
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		
		// method 전달
		main.refTest(st1, st2, st3);
		
		// Copy by Reference
		System.out.println("===== st1 copy =======");
		st3 = st1;
		System.out.println(st1);
		System.out.println(st3);

	}

	
	public void refTest(Student s1, Student s2, Student s3) {
		System.out.println("===== method refTest() =======");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}
	
}
