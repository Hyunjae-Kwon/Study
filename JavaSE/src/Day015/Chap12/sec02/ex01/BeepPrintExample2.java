//작업 스레드 생성과 실행_Thread 클래스로부터 직접 생성_메인 스레드와 작업 스레드가 동시에 실행

package Day015.Chap12.sec02.ex01;

import java.awt.Toolkit;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		//방법 1
//		Runnable beepTask = new BeepTask();
//		Thread thread = new Thread(beepTask);
		
		//Runnable 익명 객체 이용
//		Thread thread = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				for(int i = 0; i < 5; i ++) {
//					toolkit.beep();
//					try {Thread.sleep(500);
//					} catch(Exception e) {
//						
//					}
//				}
//			}
//		});
		
		//람다식 이용
		Thread thread = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i = 0; i < 5; i ++) {
				toolkit.beep();
				try {Thread.sleep(500);
				} catch (Exception e) {
				}
			}
		});
		
		
		thread.start();
		
		for(int i = 0; i < 5; i ++) {
			System.out.println("띵");
			try {Thread.sleep(500);
			} catch(Exception e) {
			}
		}
	}
}
