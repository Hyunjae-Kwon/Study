package Day016.Chap12.Example.ex10;

public class ThreadExample {
	public static void main(String[] args) {
		Thread thread = new MovieThread();
		thread.setDaemon(true);		//코드 작성
		thread.start();
		
		try {Thread.sleep(3000);} catch (InterruptedException e) {}
	}
}
