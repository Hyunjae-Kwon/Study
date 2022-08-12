//스레드 상태 제어_스레드 간 협업_두 스레드의 작업 내용을 동기화 메소드로 작성한 공유 객체

package Day016.Chap12.sec06.ex04;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA의 methodA() 작업 실행");
		notify();		//일시 정지 상태에 있는 ThreadB를 실행 대기 상태로 만듬
		try {
			wait();		//ThreadA를 일시 정지 상태로 만듬
		} catch (InterruptedException e) {
		}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB의 methodB() 작업 실행");
		notify();		//일시 정지 상태에 있는 ThreadA를 실행 대기 상태로 만듬
		try {
			wait();		//ThreadB를 일시 정지 상태로 만듬
		} catch (InterruptedException e) {
		}
	}
}
