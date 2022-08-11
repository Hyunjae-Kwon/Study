package Day015.Chap11.Example.ex06;

public class ByteToStringExample {
	public static void main(String[] args) {
		byte[] bytes = {73, 32, 108, 111, 118, 101, 32, 121, 111, 117};
		String str = new String(bytes);		//코드 작성
		System.out.println(str);
	}
}
