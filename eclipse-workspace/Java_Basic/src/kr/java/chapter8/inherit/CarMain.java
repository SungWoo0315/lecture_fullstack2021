package kr.java.chapter8.inherit;

public class CarMain {

	public static void main(String[] args) {
		Car car = new Car("자동차", 1000);
		car.run();
		// car.siren();
		
		CarAmbulance am = new CarAmbulance();
		am.run();
		am.siren();
	}

}
