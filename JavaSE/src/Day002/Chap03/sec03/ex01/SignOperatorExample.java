package Day002.Chap03.sec03.ex01;

public class SignOperatorExample {
	public static void main(String[] args) {
		
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		
		short s = 100;
		//short result3 = -s; // short 타입에서 부호만 붙여도 정수로 인식하기 때문에 int 사용
		int result3 = -s;
		System.out.println("result3 = " + result3);

	}
}