package Day003.Chap03.sec04.ex01;

public class OverflowExample {
	public static void main(String[] args) {
		
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		
		System.out.println(z);
	}
}