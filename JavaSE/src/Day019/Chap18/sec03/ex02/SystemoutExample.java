package Day019.Chap18.sec03.ex02;

import java.io.OutputStream;

public class SystemoutExample {
	public static void main(String[] args) throws Exception {
		
		OutputStream os = System.out;
		
		for(byte b = 48; b < 58; b ++) {
			os.write(b);
		}
		os.write(10);
		
		for(byte b = 97; b < 123; b ++) {
			os.write(b);
		}
		os.write(10);
		
		for(char b = 65; b < 91; b ++) {
			os.write(b);
		}
		os.write(10);
		
		String hangul = "가나다라마바사아자차카타파하";
		byte[] hangulBytes = hangul.getBytes();
		os.write(hangulBytes);
		
		os.flush();
	}
}
