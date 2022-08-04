package Day003.plusExample;

public class Operator13 {
	public static void main(String[] args) {
		
		char c1 = 'a';						// 'a' 코드값 97
		char c2 = c1;
		char c3 = ' ';
		
		int i = c1 + 1;						// 'a' + 1 = 98
		
		c3 = (char)(c1 + 1);				// 'a' 다음 'b'
		c2++;
		c2++;
		
		System.out.println("i = " + i);		//98
		System.out.println("c2 = " + c2);	//c
		System.out.println("c3 = " + c3);	//b
	}
}