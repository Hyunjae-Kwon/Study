//작업 스레드 생성과 실행_Thread 클래스로부터 직접 생성_메인 스레드만 이용한 경우

package Day015.Chap12.sec02.ex01;

import java.awt.Toolkit;

public class BeepPrintExample1 {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();	//Toolkit 객체 얻기
		for(int i = 0; i < 5; i ++) {
			toolkit.beep();								//비프음 발생
			try {Thread.sleep(500);
		} catch(Exception e) {	
			}
		}
		
		for(int i = 0; i < 5; i ++) {
			System.out.println("띵");
			try {Thread.sleep(500);
		} catch(Exception e) {	
			}
		}
	}
}
