package Day003.javaChap03;

public class Example10 {
	public static void main(String[] args) {
		char ch = 'H';
		
		char lowerCase = (ch >= 'A' && ch < 'Z') ? (char)(ch + 32) : ch;	//코드 작성
		
		System.out.println("upperCase : " + ch);
		System.out.println("lowerCase : " + lowerCase);
	}
}