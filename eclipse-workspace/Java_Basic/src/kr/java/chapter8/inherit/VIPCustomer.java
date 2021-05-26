package kr.java.chapter8.inherit;

public class VIPCustomer extends Customer {

	private int agentID; // 담당 상담원
	double saleRatio;
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}

	
	public int getAgentID(){
		return agentID;
	}
}
