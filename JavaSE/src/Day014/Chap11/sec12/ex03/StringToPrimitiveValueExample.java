//Warpper(포장)클래스_문자열을 기본 타입 값으로 변환

package Day014.Chap11.sec12.ex03;

public class StringToPrimitiveValueExample {
	public static void main(String[] args) {
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}
}
