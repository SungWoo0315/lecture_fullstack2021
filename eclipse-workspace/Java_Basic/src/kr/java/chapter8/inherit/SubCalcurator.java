package kr.java.chapter8.inherit;

public class SubCalcurator extends Calcurator {
	public void substract() {
		System.out.println(this.op1 - this.op2);
	}
}
