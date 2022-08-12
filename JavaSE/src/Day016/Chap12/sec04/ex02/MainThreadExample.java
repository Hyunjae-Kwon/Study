//동기화 메소드와 동기화 블록_공유 객체를 사용할 때의 주의할 점_메인 스레드가 실행하는 코드

package Day016.Chap12.sec04.ex02;

public class MainThreadExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
	}
}
