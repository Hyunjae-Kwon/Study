package Day019.Chap18.sec02.ex02;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {
	public static void main(String[] args) throws Exception {
		
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		byte[] data = "ABCDF".getBytes();
		os.write(data);
		os.flush();
		os.close();
	}
}
