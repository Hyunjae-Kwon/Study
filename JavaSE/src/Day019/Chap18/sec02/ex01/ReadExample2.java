package Day019.Chap18.sec02.ex01;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample2 {
	public static void main(String[] args) throws Exception {
		
		InputStream is = new FileInputStream("C:/Temp/test.txt");
		int readByteNo;						//변수
		byte[] readBytes = new byte[3];		//배열
		String data = "";					//String 객체
		while(true) {
			readByteNo = is.read(readBytes);	//배열을 읽어서 변수에 저장
			if(readByteNo == -1) break;
			data += new String(readBytes, 0, readByteNo);
		}
		System.out.println(data);
		is.close();
	}
}
