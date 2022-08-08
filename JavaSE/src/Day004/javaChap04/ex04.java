package Day004.javaChap04;

public class ex04 {
	public static void main(String[] args) {

		int sum = 0;
		int i = 0;
		
		while(sum<100) {
			++i;
			if(i%2 == 0) {
				sum -= i;
			}else {
				sum += i;
			}
		}
		System.out.println(i + "일 때, 총합이 " + sum + "이 된다.");
	}
}
