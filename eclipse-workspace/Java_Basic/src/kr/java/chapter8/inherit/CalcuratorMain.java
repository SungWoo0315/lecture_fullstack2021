package kr.java.chapter8.inherit;

public class CalcuratorMain {

	public static void main(String[] args) {

		Calcurator c = new Calcurator();
        c.setOprands(10, 20);
		c.sum();
		c.avg();
		// c.substract();
		
        SubCalcurator c1 = new SubCalcurator ();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
	}

}
