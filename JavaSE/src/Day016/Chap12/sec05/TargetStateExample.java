//스레드 상태_실행 클래스

package Day016.Chap12.sec05;

public class TargetStateExample {
	public static void main(String[] args) {
		StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
		statePrintThread.start();
	}
}
