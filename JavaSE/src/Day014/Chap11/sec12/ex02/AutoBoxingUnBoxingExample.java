//Wrapper(포장)클래스_자동 박싱과 언박싱

package Day014.Chap11.sec12.ex02;

public class AutoBoxingUnBoxingExample {
	public static void main(String[] args) {
		//자동 Boxing
		Integer obj = 100;
		System.out.println("value : " + obj.intValue());
		
		//대입 시 자동 Unboxing
		int value = obj;
		System.out.println("value : " + value);
		
		//연산 시 자동 Unboxing
		int result = obj + 100;
		System.out.println("value : " + result);
	}
}
