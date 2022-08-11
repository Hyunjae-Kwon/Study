//작업 스레드 생성과 실행_스레드의 이름_ThreadA 클래스

package Day015.Chap12.sec02.ex03;

public class ThreadA extends Thread{
	public ThreadA() {
		setName("ThreadA");									//스레드 이름 설정
	}
	/*
	 * public ThreadA() { 
	 * 		super("ThreadA"); }
	 */
	public void run() {
		for(int i = 0; i < 2; i ++) {						//Thread A 실행 내용
			System.out.println(getName() + "가 출력한 내용"); 	//getName : 스레드 이름 얻기
		}
	}
	
}
