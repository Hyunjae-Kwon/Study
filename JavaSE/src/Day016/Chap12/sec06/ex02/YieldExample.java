//스레드 상태 제어_다른 스레드에게 실행 양보 예제 (yield())

package Day016.Chap12.sec06.ex02;

public class YieldExample {
	public static void main(String[] argS) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		threadA.start();
		threadB.start();
		
		try {Thread.sleep(3000);} catch (InterruptedException e) {}
		threadA.work = false;
		
		try {Thread.sleep(3000);} catch (InterruptedException e) {}
		threadA.work = true;
		
		try {Thread.sleep(3000);} catch (InterruptedException e) {}
		threadA.stop = true;
		threadB.stop = true;
	}
}
