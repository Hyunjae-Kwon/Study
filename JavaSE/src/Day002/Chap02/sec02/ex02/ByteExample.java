package Day002.Chap02.sec02.ex02;

public class ByteExample {
	public static void main(String[] args) {
		
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		byte var6 = (byte)128; //컴파일 에러, (byte)를 앞에 입력하여 참으로 가능
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
	}
}