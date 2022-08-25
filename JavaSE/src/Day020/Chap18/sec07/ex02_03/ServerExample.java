package Day020.Chap18.sec07.ex02_03;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 5001));	//ServerSocket 생성
			while(true) {							//127.0.0.1
				System.out.println("[연결 기다림]");
				Socket socket = serverSocket.accept();	//클라이언트 연결 수락
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[연결 수락함] " + isa.getHostName());
			}
		} catch(Exception e) {}
		
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch(IOException e1) {}
		}
	}
}
