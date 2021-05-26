package kr.java.chapter8.inherit;

public class CarAmbulance extends Car {

	public CarAmbulance() {
		this.name = "앰뷸런스";
	}
	
	public void siren() {
		System.out.println("사이렌~~앵~~~");
	}
}
