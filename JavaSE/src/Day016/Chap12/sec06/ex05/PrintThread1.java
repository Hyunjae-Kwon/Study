//스레드 상태 제어_스레드의 안전한 종료_무한 반복해서 출력하는 스레드

package Day016.Chap12.sec06.ex05;

public class PrintThread1 extends Thread {
	private boolean stop;				//false
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	public void run() {
		while(!stop) {
			System.out.println("실행 중");
		}
		
		System.out.println("자원 정리");	//stop이 true가 될때 while문 빠져나옴
		System.out.println("실행 종료");
	}
}
