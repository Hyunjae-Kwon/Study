//동기화 메소드와 동기화 블록_동기화 메소드 및 동기화 블록_동기화 메소드로 수정된 공유 객체

package Day016.Chap12.sec04.ex02;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
}
