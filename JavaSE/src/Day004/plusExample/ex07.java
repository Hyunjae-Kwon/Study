package Day004.plusExample;

public class ex07 {
	public static void main(String[] args_) {
		
		int i = 0;
		int count = 0;
		int sum = 0;
		
		while(true) {
			if(i%2==1) {
				sum += i;
				count ++;
			}else if(i%2 == 0 && i%3 == 0) {
				sum += i;
				count ++;
			}
			if(sum > 1000) {
				System.out.println("합이 1000을 넘어서는 때는 : " + (count-1) + "번째");
				System.out.println(i + "를 더했을 때 1000이 넘어간다.");
				System.out.println("1000을 넘어선 값은 : " + sum);
				break;
			}
			i++;
		}
	}
}