package Day003.javaChap03;

public class Example09 {
	public static void main(String[] args) {
		char ch = 'z';
		boolean b = 'a' <= ch && ch <= 'z' || 'A' <= ch && ch <= 'Z';	//코드 작성
		
		System.out.println(b);
	}
}