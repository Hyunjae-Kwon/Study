package Day016.Chap12.Example.ex02;

public class ThreadExample {
	public static void main(String[] args) {
		Thread thread1 = new MovieThread();
		thread1.start();
		
		Thread thread2 = new Thread(new MusicRunnable());	//코드 작성
		thread2.start();
	}
}
