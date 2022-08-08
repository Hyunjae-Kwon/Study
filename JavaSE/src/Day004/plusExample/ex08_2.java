package Day004.plusExample;

public class ex08_2 {
	public static void main(String[] args) {
		
		int sum = 0;
		int i = 0;
		
		for(i = 1; sum < 100; i++) {
			if(i%2 == 0) {
				sum -= i;
			}else {
				sum += i;
			}
		}
		System.out.println(i + "까지 더하면 총 합이 " + sum + "이다.");
	}
}