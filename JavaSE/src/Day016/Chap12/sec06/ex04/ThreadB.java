//스레드 상태 제어_스레드 간 협업_WorkObject의 methodB()를 실행하는 스레드

package Day016.Chap12.sec06.ex04;

public class ThreadB extends Thread {
	private WorkObject workObject;
	
	public ThreadB(WorkObject workObject) {
		this.workObject = workObject;		//공유 객체를 매개값으로 받아 필드에 저장
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i ++) {		//공유 객체의 methodB()를 10번 반복 호출
			workObject.methodB();
		}
	}
}
