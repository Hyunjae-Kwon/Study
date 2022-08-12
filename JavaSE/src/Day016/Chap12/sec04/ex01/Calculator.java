//동기화 메소드와 동기화 블록_공유 객체를 사용할 때의 주의할 점_공유 객체

package Day016.Chap12.sec04.ex01;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
}
