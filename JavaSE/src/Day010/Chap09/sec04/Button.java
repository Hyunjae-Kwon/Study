package Day010.Chap09.sec04;

public class Button {
	interface OnClickListener{
		void onClick();
	}
	
	OnClickListener listener;
	
	void setOnclickListener(OnClickListener listener) {
		this.listener = listener;
	}

	void touch() {
		listener.onClick();
	}
}