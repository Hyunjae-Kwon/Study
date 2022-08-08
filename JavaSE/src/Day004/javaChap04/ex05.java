package Day004.javaChap04;

public class ex05 {
	public static void main(String[] args) {
		int i = 0;
		while(i<=10) {
			int j = 0;
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
