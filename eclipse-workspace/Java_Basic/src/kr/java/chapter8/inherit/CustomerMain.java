package kr.java.chapter8.inherit;

public class CustomerMain {

	public static void main(String[] args) {
		
		//Customer customerLee = new Customer(10010, "이순신");
		/*Customer customerLee = new Customer();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());*/

		// 생성자 호출 순서.
		//VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 12345);
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(   customerKim.showCustomerInfo());
	}

}
