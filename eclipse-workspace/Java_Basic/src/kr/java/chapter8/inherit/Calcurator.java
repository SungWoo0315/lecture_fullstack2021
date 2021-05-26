package kr.java.chapter8.inherit;

public class Calcurator {
	int op1, op2;

	public void setOprands(int left, int right) {
		this.op1 = left;
		this.op2 = right;
	}

	public void sum() {
		System.out.println(this.op1 + this.op2);
	}

	public void avg() {
		System.out.println((this.op1 + this.op2) / 2);
	}
}
