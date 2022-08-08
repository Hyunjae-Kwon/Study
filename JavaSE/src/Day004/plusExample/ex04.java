package Day004.plusExample;

public class ex04 {
	public static void main(String[] args) {
		
		for(int m = 2; m <= 9; m++) {
			System.out.println(m + "단");
			for(int n = 1; n<= 9; n++) {
				if(m != 6 && m !=7) {
					System.out.println(m + " x " + n + " = " + (m*n));
				}
			}
		}
	}
}