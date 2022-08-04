package Day003.Chap03.sec04.ex01;

public class OverflowExample2 {
	public static void main(String[] args) {
		
		long x = 1000000;
		long y = 1000000;
		long z = x * y;
		
		System.out.println(z);
	}
}