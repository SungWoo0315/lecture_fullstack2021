package ch10;

public class CompleteCalc extends Calculator {

	@Override
	public void descrition() {
		System.out.println("완벽계산!");
	}
	
	@Override
	public int divide(int n1, int n2) {
		if( n2 != 0)
			return n1/n2;
		else
			return Calc.ERROR;
	}
}
