//작업 스레드 생성과 실행_스레드의 이름_ThreadB 클래스

package Day015.Chap12.sec02.ex03;

public class ThreadB extends Thread {
	public void run() {
		for(int i = 0; i < 2; i ++) {
			System.out.println(getName() + "가 출력한 내용");
		}
	}
}
