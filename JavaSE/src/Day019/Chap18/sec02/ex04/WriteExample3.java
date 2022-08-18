package Day019.Chap18.sec02.ex04;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class WriteExample3 {
	public static void main(String[] args) throws Exception {
		
		Writer writer = new FileWriter("C:/Temp/test1.txt");
		char[] data = "홍길동".toCharArray();
		writer.write(data, 1, 2);
		
		writer.flush();
		writer.close();
		
		/*
		Reader reader = new FileReader("C:/Temp/test1.txt");
		int readCharNo;
		char[] cbuf = new char[2];
		String data2 = "";
		while(true) {
			readCharNo = reader.read(cbuf);
			if(readCharNo == -1) break;
			data2 += new String(cbuf, 0, readCharNo);
		}
		System.out.println(data2);
		reader.close();
		*/
	}
}
