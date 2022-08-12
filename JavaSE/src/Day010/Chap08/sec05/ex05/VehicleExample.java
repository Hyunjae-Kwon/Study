package Day010.Chap08.sec05.ex05;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
//		vehicle.checkFare();		//Vehicle 인터페이스에는 checkFare() 없음
		
		Bus bus = (Bus) vehicle;	//강제 타입 변환
		
		bus.run();
		bus.checkFare();
	}
}