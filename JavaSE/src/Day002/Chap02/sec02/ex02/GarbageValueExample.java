package Day002.Chap02.sec02.ex02;

public class GarbageValueExample {
	public static void main(String[] args) {
		
		byte var1 = 125;
		
		byte var2 = 125;
		
		for(int i = 0; i < 5; i++) {
			var1++;
			var2++;
			System.out.println("var1 : " + var1 + "\t" + "var2 : " + var2);			
		}
	}
}