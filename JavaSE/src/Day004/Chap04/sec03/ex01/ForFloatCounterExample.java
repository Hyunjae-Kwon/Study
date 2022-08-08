package Day004.Chap04.sec03.ex01;

public class ForFloatCounterExample {
	public static void main(String[] args) {
		
		for(float x = 0.1f; x <= 1.0f; x += 0.1f) {
			System.out.println(x);
		}
	}
}

//실수형 변수는 사용하지 않는다.