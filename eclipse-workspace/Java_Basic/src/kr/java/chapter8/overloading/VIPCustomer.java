package kr.java.chapter8.overloading;

import java.text.Annotation;

public class VIPCustomer extends Customer {

	private int agentID; // 담당 상담원
	double saleRatio;
	
	public VIPCustomer() {
		// super();
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;

		System.out.println("VIPCustomer() 생성자 호출.");
	}

	
	public String showVIPInfo(){
		return super.showCustomerInfo() +  " 담당상담원은" + agentID + " 입니다.";  
		 
	}
	
	public int getAgentID(){
		return agentID;
	}
	
	//
	/* */

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
}

