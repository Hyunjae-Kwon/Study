package Day007.Chap06.sec09;

public class Car {
	//필드
	String model;
	int speed;
	
	//생성자
	Car(String model){			//model -> m
		this.model = model;		//뒤의 model -> m 으로 바꾸면 this. 를 붙일 필요는 없다.
	}
	
	//메소드
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i = 0; i <= 50; i += 10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다. (시속 : " + this.speed + "km/h)");
		}	//위의 this. 은 붙이지 않아도 무방하다.
	}
}