package kr.java.chapter8.customer_poly;

public class Customer {
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public Customer() {
		this(0, "");
	}
	
	public Customer(int customerID, String customerName){
	
		this.customerID = customerID;
		this.customerName = customerName;

		initCustomer();
		
		System.out.println("Customer() 생성자 호출.");
	}
	
	

	private void initCustomer()
	{
		customerGrade = "SILVER";
		bonusRatio = 0.01;	
	}
	
	
	public int calcPrice(int price){
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	protected String showCustomerInfo(){
		return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";  
	}

	
}
