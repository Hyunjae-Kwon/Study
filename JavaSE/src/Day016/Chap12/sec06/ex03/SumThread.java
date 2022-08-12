//스레드 상태 제어_다른 스레드의 종료를 기다림_1부터 100까지 합을 계산하는 스레드

package Day016.Chap12.sec06.ex03;

public class SumThread extends Thread{
	private long sum;
	
	public long getSum() {
		return sum;
	}
	
	public void setSum(long sum) {
		this.sum = sum;
	}
	
	public void run() {
		for(int i = 1; i <= 100; i ++) {
			sum += i;
		}
	}
}
