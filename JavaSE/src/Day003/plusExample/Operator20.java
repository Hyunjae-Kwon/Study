package Day003.plusExample;

public class Operator20 {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 10000; i++) {
			if(i%3 == 0) {					// i가 3으로 나누어 떨어지면 출력
				System.out.println(i);
			}
		}
	}
}