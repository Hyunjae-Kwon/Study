package OOPTest.Test17;

public class Test {
	String s;

	void Test() {
		s = "constructor";
	}
	void go() {
		System.out.println(s);
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.go();
	}
}
