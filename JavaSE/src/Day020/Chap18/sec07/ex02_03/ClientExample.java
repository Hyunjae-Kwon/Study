package Day020.Chap18.sec07.ex02_03;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) {
		
		Socket socket = null;
		try {
			socket = new Socket();				//Socket 생성
			System.out.println("[연결 요청]");
			socket.connect(new InetSocketAddress("localhost", 5001));	//연결 요청
			System.out.println("[연결 성공]");
		} catch (Exception e) {}
		
		if(!socket.isClosed()) {		//연결이 되어 있을 경우
			try {
				socket.close();			//연결 끊기
			} catch (IOException e1) {}
		}
	}
}
