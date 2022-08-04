package Day002.Chap02.sec03.ex02;

public class FrontIntToDouble {
	public static void main(String[] args) {
		
		int num1 = 12345780;
		int num2 = 12345780;
		
		double num3 = num2;	//123456780.0
		num2 = (int) num3;	//123456780
		
		int result = num1 - num2;
		System.out.println(result);
	}
}