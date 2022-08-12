//스레드 상태 제어_스레드 간 협업_두 스레드를 생성하고 실행하는 메인 스레드

package Day016.Chap12.sec06.ex04;

public class WaitNotifyExample {
	public static void main(String[] args) {
		WorkObject sharedObject = new WorkObject();
		
		ThreadA threadA = new ThreadA(sharedObject);	//ThreadA와 ThreadB 생성
		ThreadB threadB = new ThreadB(sharedObject);
		
		threadA.start();	//ThreadA와 ThreadB 실행
		threadB.start();
	}
}
