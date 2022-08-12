//스레드 그룹_스레드 그룹 이름 얻기_현재 실행 중인 스레드 정보

package Day016.Chap12.sec08.ex01;

import java.util.Map;
import java.util.Set;

import Day016.Chap12.sec07.AutoSaveThread;

public class ThreadInfoExample {
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setName("AutoSaveThread");
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		//프로세스에서 실행하는 모든 Thread를 가져오는 코드 : Thread.getAllStackTraces();
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		Set<Thread> threads = map.keySet();
		for(Thread thread : threads) {	//Thread를 하나씩 가져와 루핑시킴
			System.out.println("Name : " + thread.getName() + ((thread.isDaemon())? "(데몬)" : "(주)"));
			System.out.println("\t" + "소속 그룹 : " + thread.getThreadGroup().getName());
			System.out.println();
		}
	}
}
