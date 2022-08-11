package Day009.Chap08.sec03.ex01;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;
		
		rc = new Television();
		
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.turnOff();
		
		rc = new Audio();
		
		rc.turnOn();
		rc.turnOff();
		
	}
}