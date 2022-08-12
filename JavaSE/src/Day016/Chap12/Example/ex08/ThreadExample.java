package Day016.Chap12.Example.ex08;

public class ThreadExample {
	public void main(String[] args) {
		Thread thread = new MovieThread();
		thread.start();
		
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		
		thread.interrupt();
	}
}
