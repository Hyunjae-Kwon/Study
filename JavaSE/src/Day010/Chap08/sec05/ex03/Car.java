package Day010.Chap08.sec05.ex03;

public class Car {
	Tire[] tires = {               //객체 이름 없음
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire()
	};
	
	void run() {
		for(Tire tire : tires) {     //개선된 for문
			tire.roll();
		}
	}
}