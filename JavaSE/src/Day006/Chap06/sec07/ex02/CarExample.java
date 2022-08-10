package Day006.Chap06.sec07.ex02;

public class CarExample {
	public static void main(String[] args) {
		
		Car myCar = new Car("검정", 3000);
		//Car myCar = new Car(); //기본 생성자를 호출 할 수 없다.
		System.out.println(myCar.color);
		System.out.println(myCar.cc);
		
		Car myCar2 = new Car();
		myCar2.color = "white";
		myCar2.cc = 2000;
		System.out.println(myCar2.color);
		System.out.println(myCar2.cc);

	}
}