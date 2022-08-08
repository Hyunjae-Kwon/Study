package OOPTest.Test06;

public class ex01 {
	public static void main(String[] args) {

		String str = "0000000001111111";
		
		int a = Integer.parseInt(str, 2);
		String str16 = Integer.toOctalString(a);
		String str8 = Integer.toHexString(a);
		
		System.out.println("10진수 : " +a);
		System.out.println("8진수 : " + str8);
		System.out.println("16진수 : " + str16);
	}
}
