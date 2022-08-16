package Day017.Chap13.sec04.ex01_boxing;

public class BoxingMethodExample {
	public static void main(String[] args) {
		Box<Integer> box1 = Util.<Integer>boxing(100);
		int intValue = box1.get();
		System.out.println(intValue);
		
		Box<String> box2 = Util.<String>boxing("홍길동");		//Util.<Stirng> 에서 <String> 은 넣는것이 원칙이나 빼도 무방하다.
		String strValue = box2.get();
		System.out.println(strValue);
	}
}
