package Day004.javaChap04;

public class ex02 {
	public static void main(String[] args) {
		
		int sum = 0;
		int i = 0;
		
		for(i = 1; i<=20; i++) {
			if(i%2==0 || i%3 ==0) {
				continue;
			}
			sum += i;
		}
		System.out.println(sum);
	}
}
