package Day004.Chap04.Example;

public class ex05 {
	public static void main(String[] args) {
		
		while(true) {
			int m = (int)(Math.random() * 6) + 1;
			int n = (int)(Math.random() * 6) + 1;
			System.out.println("(" + m + ", " + n + ")");	
			if((m + n) == 5) {
				break;
			}
		}
	}
}
