//스레드 상태 제어_스레드 간 협업_두 스레드를 생성하고 실행하는 메인 메소드

package Day016.Chap12.sec06.ex04_2;

public class WaitNotifyExample {
	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		
		ProducerThread producerThread = new ProducerThread(dataBox);
		ConsumerThread consumerThread = new ConsumerThread(dataBox);
		
		producerThread.start();
		consumerThread.start();
	}
}
