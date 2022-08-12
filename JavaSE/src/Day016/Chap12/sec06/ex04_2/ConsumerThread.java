//스레드 상태 제어_스레드 간 협업_데이터를 소비하는(읽는) 스레드

package Day016.Chap12.sec06.ex04_2;

public class ConsumerThread extends Thread {
	private DataBox dataBox;
	
	public ConsumerThread(DataBox dataBox) {
		this.dataBox = dataBox;					//공유 객체를 필드에 저장
	}
	
	@Override
	public void run() {
		for(int i = 1; i <= 3; i ++) {
			String data = dataBox.getData();	//새로운 데이터를 읽음
		}
	}
}
