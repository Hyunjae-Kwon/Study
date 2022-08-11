//작업 스레드 생성과 실행_Thread 클래스로부터 직접 생성_비프음을 들려주는 작업 정의

package Day015.Chap12.sec02.ex01;

import java.awt.Toolkit;

public class BeepTask implements Runnable {
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i ++) {
			toolkit.beep();
			try {Thread.sleep(500);
			} catch(Exception e) {
			}
		}
	}
}
