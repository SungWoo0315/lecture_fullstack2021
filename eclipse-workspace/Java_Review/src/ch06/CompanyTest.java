package ch06;

public class CompanyTest {

	public static void main(String[] args) {
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		
		//Company m = new Company();
		
		System.out.println( myCompany1 == myCompany2 ); // 객체값 비교!
	}

}
