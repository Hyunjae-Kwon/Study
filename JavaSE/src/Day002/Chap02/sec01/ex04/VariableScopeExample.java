package Day002.Chap02.sec01.ex04;

public class VariableScopeExample {
	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2 = v1 - 10;
		}
		//int v3 = v1 + v2 + 5;
	}
}