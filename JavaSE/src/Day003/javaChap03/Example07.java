package Day003.javaChap03;

public class Example07 {
	public static void main(String[] args) {
		
		int fahrenheit = 100;
		float celcius = (int)((5/9f*(fahrenheit - 32))*100 + 0.5) / 100f;	//코드 작성
		
		System.out.println("Fahrenheit : " + fahrenheit);
		System.out.println("Celcius : " + celcius);
				
	}
}