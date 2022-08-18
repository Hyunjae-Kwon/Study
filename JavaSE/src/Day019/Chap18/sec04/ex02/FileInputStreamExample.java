package Day019.Chap18.sec04.ex02;

import java.io.FileInputStream;

public class FileInputStreamExample {
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\guyn2\\git\\Study\\JavaSE\\src\\Day019\\Chap18\\sec04\\ex02\\FileInputStreamExample.java");
			
			int data;
			while((data = fis.read()) != -1) {
				System.out.write(data);
			}
			fis.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		/*
		try(FileInputStream fis2 = new FileInputStream("C:\\Users\\guyn2\\git\\Study\\JavaSE\\src\\Day019\\Chap18\\sec04\\ex02\\FileInputStreamExample.java")){
			int data;
			while((data = fis2.read()) != -1) {
				System.out.write(data);
			}
			fis2.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		*/
	}
}
