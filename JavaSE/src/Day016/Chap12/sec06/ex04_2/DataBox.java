//스레드 상태 제어_스레드 간 협업_두 스레드의 작업 내용을 동기화 메소드로 작성한 공유 객체

package Day016.Chap12.sec06.ex04_2;

public class DataBox {
	private String data;
	
	public synchronized String getData() {
		if(this.data == null) {		//data 필드가 null이면 소비자 스레드를 일시 정지 상태로 만듬
			try {
				wait();
			} catch(InterruptedException e) {}
		}
		String returnValue = data;
		System.out.println("ConsummerThread가 읽은 데이터 : " + returnValue);
		data = null;				//data 필드를 null로 만들고 생산자 스레드를 실행 대기 상태로 만듬
		notify();
		return returnValue;
	}
	
	public synchronized void setDate(String data) {
		if(this.data != null) {		//data 필드가 null이 아니면 생산자 스레드(setData)를 일시 정지 상태로 만듬
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		this.data = data;			//data 필드에 값을 저장하고 소비자 스레드를 실행 대기 상태로 만듬
		System.out.println("ProducerThread가 생성한 데이터 : " + data);
		notify();
	}
}
