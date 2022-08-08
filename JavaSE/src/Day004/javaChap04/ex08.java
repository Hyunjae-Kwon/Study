package Day004.javaChap04;

public class ex08 {
	public static void main(String[] args) {
		
		int x, y = 0;
		
		for(x = 0; x <= 10; x ++) {
			for(y = 0; y <= 10; y ++) {
				if(2 * x + 4 * y == 10) {
					System.out.println("x = " + x + ", "+ "y = " + y);
				}
			}
		}
	}
}
