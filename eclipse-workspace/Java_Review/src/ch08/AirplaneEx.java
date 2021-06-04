package ch08;

/*
* 비행기는 날아 갈 수 있다.(일반 비행기)
* 초음속 비행기는 모드가 초음속이면 초음속으로 날고
* 모드가 일반이면 일반 비행기 속도로 난다.
* 
* 비행기 -> Airplane
*          + land()
*          + takeoff()
*          + fly()
*          
* 초음속 -> Supersonic extends Airplane
           + mode: NORMAL, SUPERSONIC (상수)
*          + @override fly()
* 
*/
public class AirplaneEx {
	// HAS a
	Airplane plane  = new Airplane();


	public static void main(String[] args) {
		Airplane plane  = new Airplane();
		plane.takeOff();
		plane.fly();
		plane.land();
		
		SupersonicAirplane splane = new SupersonicAirplane();
		splane.takeOff();
		splane.fly();
		splane.setMode(SupersonicAirplane.SUPERSONIC);
		splane.fly();
		splane.setMode(SupersonicAirplane.NORMAL);
		splane.fly();
		splane.land();
	}

}

// IS-A 관계
class Busplane extends Airplane {
	
}

class Boatplane extends Airplane {
	
}

















