package Day019.Chap18.sec02.ex02;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample1 {
	public static void main(String[] args) throws Exception {
		//OutputStream 객체 생성 (추상 클래스 : 단독 객체 생성 불가) FileOutputStream을 이용해서 객체 생성
		OutputStream os = new FileOutputStream("C:\\Temp\\test.txt"); //new FileOutputStream("C:/Temp/test.txt", true); 
		byte[] data = "ABC".getBytes();		//String "ABC"를 바이트 배열로 data 배열에 입력 String.getBytes() : 스트링 클래스의 메소드
		for(int i = 0; i < data.length; i ++) {
			os.write(data[i]);
		}
		os.flush();
		os.close();
	}
}
//가장 많이 사용, 위의 true를 넣으면 지우고 입력이 아닌 입력 추가