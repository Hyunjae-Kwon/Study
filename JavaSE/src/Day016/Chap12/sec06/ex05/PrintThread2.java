//스레드 상태 제어_스레드의 안전한 종료_무한 반복해서 출력하는 스레드
//2개 합침

package Day016.Chap12.sec06.ex05;

public class PrintThread2 extends Thread {
	public void run() {
		/*
		try {
			while(true) {
				System.out.println("실행 중");
				Thread.sleep(1);
			}
		} catch (InterruptedException e) {	//InterruptedException 발생
		}
		*/
		while(true) {
			System.out.println("실행 중");
			if(Thread.interrupted()) {
				break;
			}
		}
		//while문을 빠져나옴
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
