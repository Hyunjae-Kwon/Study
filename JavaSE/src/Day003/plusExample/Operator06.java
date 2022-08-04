package Day003.plusExample;

public class Operator06 {
	public static void main(String[] args) {
		
		byte b = 10;
		//byte result = ~b; //연산자 붙으면 int
		byte result = (byte)~b;
		
		System.out.println("b = " + b);
		System.out.println("~b = " + result);
	}
}