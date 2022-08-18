package Day019.Chap18.sec02.ex02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class WriteExample3 {
	public static void main(String[] args) throws Exception {
		
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		byte[] data = "ABC".getBytes();
		os.write(data, 1, 2);
		os.flush();
		os.close();
		
		/*	write 확인
		InputStream is = new FileInputStream("C:\\Temp\\test.txt");
		int readByteNo;						//변수
		byte[] readBytes = new byte[3];		//배열
		String data2 = "";					//String 객체
		while(true) {
			readByteNo = is.read(readBytes);	//배열을 읽어서 변수에 저장
			if(readByteNo == -1) break;
			data2 += new String(readBytes, 0, readByteNo);
		}
		System.out.println(data2);
		is.close();
		*/
		
	}
}
