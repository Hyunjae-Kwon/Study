package Day003.Chap03.sec04.ex03;

public class StringEqualsExample {
	public static void main(String[] args) {
		
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		String strVar3 = new String("신민철");
		
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1 == strVar3);
		System.out.println();
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
	}
}

// == 메모리를 비교
// equals : 데이터 값을 비교