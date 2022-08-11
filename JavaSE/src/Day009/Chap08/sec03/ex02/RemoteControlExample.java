package Day009.Chap08.sec03.ex02;

import Day009.Chap08.sec03.ex01.RemoteControl;

public class RemoteControlExample {
	public static void main(String[] args) {
		
		RemoteControl rc = new RemoteControl() {
			
			private int volume;
			
			public void turnOn() {/*실행문*/
				System.out.println("TV를 켭니다.");
			}
			public void turnOff() {/*실행문*/
				System.out.println("TV를 끕니다.");
			}
			public void setVolume(int volume) {/*실행문*/
				if(volume > RemoteControl.MAX_VOLUME) {
					this.volume = RemoteControl.MAX_VOLUME;
				} else if(volume < RemoteControl.MIN_VOLUME) {
					this.volume = RemoteControl.MIN_VOLUME;
				} else {
					this.volume = volume;
				}
				System.out.println("현재 TV 볼륨 : " + volume);
			}
		};
	}
}