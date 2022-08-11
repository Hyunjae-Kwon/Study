package Day009.Chap07.sec08.ex03;

public class PhoneExample {
	public static void main(String[] args) {
//		Phone phone = new Phone();	//추상 클래스는 객체를 생성할 수 없다.
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}