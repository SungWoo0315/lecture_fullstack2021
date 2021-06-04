package ch08;

/*
* 비행기는 날아 갈 수 있다.(일반 비행기)
* 초음속 비행기는 모드가 초음속이면 초음속으로 날고
* 모드가 일반이면 일반 비행기 속도로 난다.
* 초음속 -> Supersonic extends Airplane
           + mode: NORMAL, SUPERSONIC (상수)
*          + @override fly()
*/
public class SupersonicAirplane extends Airplane {
	public final static int NORMAL = 0;
	public final static int SUPERSONIC = 1;

	private int mode = NORMAL;
	
	@Override
	public void fly() {
		if( mode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		} else {
			super.fly();
		}
	}
	
	public void setMode(int m) {
		this.mode = m;
	}

}
