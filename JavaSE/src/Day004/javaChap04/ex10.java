package Day004.javaChap04;

public class ex10 {
	public static void main(String[] args) {
		
		int num = 12345;
		int sum = 0;
		
		while(num > 0) {
			sum += num%10;
			num /= 10;
		}
		System.out.println("sum = " + sum);
	}
}
