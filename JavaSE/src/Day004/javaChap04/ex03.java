package Day004.javaChap04;

public class ex03 {
	public static void main(String[] args) {
		
		int sum = 0;
		int i = 0;
		int j = 0;
		
		for(i = 1; i <= 10; i++) {
			for(j = 1; j <= i; j++) {
				sum = sum + j;
			}
		}
		System.out.println(sum);
	}
}
