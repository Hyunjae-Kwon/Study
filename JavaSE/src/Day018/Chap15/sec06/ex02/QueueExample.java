package Day018.Chap15.sec06.ex02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail", "홍길동"));		//메세지 저장
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendKakaotalk", "홍두께"));
		
		while(!messageQueue.isEmpty()) {			//메세지 큐가 비었는지 확인
			Message message = messageQueue.poll();	//메세지 큐에서 한개의 메세지를 커내고 큐에서 삭제
			switch(message.command) {
			case "sendMail" :
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS" : 
				System.out.println(message.to + "님에게 SMS를 보냅니다.");
				break;
			case "sendKakaotalk" : 
				System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
				break;
			}
		}
	}
}
