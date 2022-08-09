//System클래스_현재 시각 읽기_프로그램 실행 소요 시간 구하기 (currentTimeMillis(), nanoTime())

package Day013.Chap11.sec05.ex03;

public class SystemTimeExample {
	public static void main(String[] args) {
		long time1 = System.nanoTime();
		
		int sum = 0;
		for (int i = 1; i <= 1000000; i ++) {
			sum += i;
		}

		long time2 = System.nanoTime();
		
		System.out.println("1~1000000 까지의 합 : " + sum);
		System.out.println("계산에 " + (time2 - time1) + " 나노초가 소요되었습니다.");
	}
}
