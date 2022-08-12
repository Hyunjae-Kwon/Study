//동기화 메소드와 동기화 블록_공유 객체를 사용할 때의 주의할 점_User1 스레드

package Day016.Chap12.sec04.ex02;

public class User1 extends Thread {
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("CalculatorUser1");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(100);
	}
}
