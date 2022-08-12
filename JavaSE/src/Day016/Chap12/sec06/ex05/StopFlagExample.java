//스레드 상태 제어_스레드의 안전한 종료_1초 후 출력 스레드를 중지시킴

package Day016.Chap12.sec06.ex05;

public class StopFlagExample {
	public static void main(String[] args) {
		PrintThread1 printThread = new PrintThread1();
		printThread.start();
		
		try { Thread.sleep(1000); } catch (InterruptedException e) {}
		
		printThread.setStop(true);
	}
}
