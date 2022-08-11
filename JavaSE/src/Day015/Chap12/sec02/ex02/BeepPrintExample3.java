//작업 스레드 생성과 실행_Thread 하위 클래스로부터 생성_메인 스레드와 작업 스레드가 동시에 실행

package Day015.Chap12.sec02.ex02;

public class BeepPrintExample3 {
	public static void main(String[] args) {
		Thread thread = new BeepThread();
		thread.start();
		
		for(int i = 0; i < 5; i ++) {
			System.out.println("띵");
			try { Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}
}
