package Day003.plusExample;

public class Operator02 {
	public static void main(String[] args) {
		
		int i = 5;
		int j = 0;
		
		j = i++;
		
		System.out.println("j = i++; 실행 후, i = " + i + ", j = " + j); // 6, 5
		
		i = 5;
		j = 0;
		j = ++i;
		
		System.out.println("j = ++i; 실행 후, i = " + i + ", j = " + j); // 6, 6
	}
}