package Day011.Chap09.sec05.ex02;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	//필드 초기값으로 대입
	Button.OnClickListener listener = new Button.OnClickListener() {
		@Override
		public void onClick() {
			// TODO Auto-generated method stub
			System.out.println("전화를 겁니다.");
		}
	};
	
	Window(){
		button1.setOnClickListener(listener);
		button2.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("메세지를 보냅니다.");
			}
		});
	}
}
