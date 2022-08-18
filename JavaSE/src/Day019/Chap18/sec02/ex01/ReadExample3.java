package Day019.Chap18.sec02.ex01;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample3 {
	public static void main(String[] args) throws Exception {
		
		InputStream is = new FileInputStream("C:\\Temp\\test.txt");
		int readByteNo;							//0 1 2 3 4 5 6 7
		byte[] readBytes = new byte[8];			//[][][][][][][][]
		readByteNo = is.read(readBytes, 2, 3);	//readBytes 배열의 2부터 3개 채운다
		for(int i = 0; i < readBytes.length; i ++) {
			System.out.println(readBytes[i]);
		}
		is.close();
	}
}
