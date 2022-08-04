package Day002.Chap02.sec03.ex02;

public class FrontIntToFloat {
	public static void main(String[] args) {
		
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;	//123456780.0 //정수 타입 int 를 실수 타입 float 로 변환하면서 근사치로 변환
		num2 = (int) num3;	//123456780
		
		int result = num1 - num2;
		System.out.println(result);
	}
}