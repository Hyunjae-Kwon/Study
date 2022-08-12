//스레드 그룹_스레드 그룹의 일괄 interrupt()_스레드 그룹을 이용한 일괄 종료 예제

package Day016.Chap12.sec08.ex03;

public class ThreadGroupExample {
	public static void main(String[] args) {
		ThreadGroup myGroup = new ThreadGroup("myGroup");
		WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
		WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");
		//위 코드 : myGroup 에 두 스레드를 포함시킴 (스레드 그룹)
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("[ main 스레드 그룹의 list() 메소드 출력 내용 ]");
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		mainGroup.list();
		System.out.println();
		
		try { Thread.sleep(3000); } catch (InterruptedException e) {}
		
		System.out.println("[ myGroup 스레드 그룹의 interrupt() 메소드 호출");
		myGroup.interrupt();
	}
}
