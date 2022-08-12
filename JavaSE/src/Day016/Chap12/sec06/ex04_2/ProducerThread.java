//스레드 상태 제어_스레드 간 협업_데이터를 생산(저장) 하는 스레드

package Day016.Chap12.sec06.ex04_2;

public class ProducerThread extends Thread {
	private DataBox dataBox;
	
	public ProducerThread(DataBox dataBox) {
		this.dataBox = dataBox;			//공유 객체를 필드에 저장
	}
	
	@Override
	public void run() {
		for(int i = 1; i <= 3; i ++) {
			String data = "Data - " + i;
			dataBox.setDate(data);		//새로운 데이터를 저장
		}
	}
}
