package Day012.Chap10.Example.ex07;

public class WrongPassWordException extends Exception {
	public WrongPassWordException () {}
	public WrongPassWordException(String message) {
		super(message);
	}
}
