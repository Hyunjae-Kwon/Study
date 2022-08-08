package Day012.Chap11.sec03.ex03;

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		
		String str0bj = myPhone.toString();
		System.out.println(str0bj);
		
		System.out.println(myPhone);
	}
}
