package Day004.Chap04.sec03.ex01;

public class ForSumFrom1To100Example2 {
	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		
		for(i = 1; i <= 100; i++) {
			sum = sum + i; // sum += i;
		}
		System.out.println("1부터 " + (i-1) + "까지의 합은 : " + sum);
	}
}