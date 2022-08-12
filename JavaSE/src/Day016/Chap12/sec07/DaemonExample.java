//데몬 스레드_메인 스레드가 실행하는 코드

package Day016.Chap12.sec07;

public class DaemonExample {
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true);		//AutoSaveThread를 데몬 스레드로 만듬
		autoSaveThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		System.out.println("메인 스레드 종료");
	}
}
