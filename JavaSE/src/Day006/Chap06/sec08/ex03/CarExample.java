package Day006.Chap06.sec08.ex03;

public class CarExample {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.keyTurnOn();
		myCar.run();
		
		int speed = myCar.getSpeed();
		System.out.println("현재 속도 : " + speed + "km/h");
	}
}