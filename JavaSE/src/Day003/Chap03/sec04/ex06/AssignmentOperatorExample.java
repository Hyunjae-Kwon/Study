package Day003.Chap03.sec04.ex06;

public class AssignmentOperatorExample {
	public static void main(String[] args) {
		
		int result = 0;
		result += 10;
		System.out.println("result = " + result); //10
		
		result -= 5;
		System.out.println("result = " + result); //5
		
		result *= 3;
		System.out.println("result = " + result); //15
		
		result /= 5;
		System.out.println("result = " + result); //3
		
		result %= 3;
		System.out.println("result = " + result); //0
	}
}