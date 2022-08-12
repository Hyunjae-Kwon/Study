//스레드 상태_타겟 스레드

package Day016.Chap12.sec05;

public class TargetThread extends Thread {
	public void run() {
		for(long i = 0; i < 1000000000; i ++) {}
	
		try {
			//1.5초간 일시 정지
			Thread.sleep(1500);
		} catch (Exception e) {}
		
		for(long i = 0; i < 1000000000; i ++) {}
	}
}
