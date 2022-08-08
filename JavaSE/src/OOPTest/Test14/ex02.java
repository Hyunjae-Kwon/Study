package OOPTest.Test14;

public class ex02 {
	public static void main(String[] args) {
		char result[] = new char[5];
		
		for(int i = 0; i < result.length; i ++) {
			for(int j = 0; j < result.length - i; j ++) {
				result[j] = '*';
				System.out.print(result[j]);
			}
			System.out.println();
		}
	}
}
