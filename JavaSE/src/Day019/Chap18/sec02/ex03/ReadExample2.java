package Day019.Chap18.sec02.ex03;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample2 {
	public static void main(String[] args) throws Exception {
		
		Reader reader = new FileReader("C:/Temp/OOPTest.txt");
		int readCharNo;
		char[] cbuf = new char[2];
		String data = "";
		while(true) {
			readCharNo = reader.read(cbuf);
			if(readCharNo == -1) break;
			data += new String(cbuf, 0, readCharNo);
		}
		System.out.println(data);
		reader.close();
	}
}
