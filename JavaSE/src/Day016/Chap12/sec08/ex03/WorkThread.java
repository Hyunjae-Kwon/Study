//스레드 그룹_스레드 그룹의 일괄 interrupt()_InterruptedException이 발생할 때 스레드가 종료되도록 함

package Day016.Chap12.sec08.ex03;

public class WorkThread extends Thread {
	public  WorkThread(ThreadGroup threadGroup, String threadName) {
		super(threadGroup, threadName);		//스레드 그룹과 스레드 이름을 설정
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {		//InterruptedException이 발생될 때, while문을 빠져나와 스레드를 종료시킴
				System.out.println(getName() + " interrupted ");
				break;
			}
		}
		System.out.println(getName() + "종료됨");
	}

}
