package Day020.Chap18.sec05.ex05.serialVersionUID;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SeriaVersionIUIDExample2 {
	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("C:/Temp/Object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ClassC classC = (ClassC) ois.readObject();
		System.out.println("field1 : " + classC.field1);
	}
}
