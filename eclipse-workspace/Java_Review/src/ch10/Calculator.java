package ch10;

public class Calculator implements Calc {

	@Override
	public int add(int n1, int n2) {
		return n1 + n2;
	}

	@Override
	public int substract(int n1, int n2) {
		return n1 - n2;
	}

	@Override
	public int times(int n1, int n2) {
		return 0;
	}

	@Override
	public int divide(int n1, int n2) {
		return 0;
	}

}
