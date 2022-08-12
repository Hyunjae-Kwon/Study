//스레드 상태 제어_주어진 시간동안 일시 정지_3초 주기로 10번 비프음 발생

package Day016.Chap12.sec06.ex01;

import java.awt.Toolkit;

public class SleepExample {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 10; i ++) {
			toolkit.beep();
			try {
				Thread.sleep(3000);
			} catch(InterruptedException e) {}
		}
	}
}
