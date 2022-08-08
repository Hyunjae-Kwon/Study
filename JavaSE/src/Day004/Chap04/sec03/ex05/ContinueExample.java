package Day004.Chap04.sec03.ex05;

public class ContinueExample {
	public static void main(String[] args) throws Exception{
		for(int i = 1; i <= 10; i ++) {
			if(i%2 != 0) {			//2로 나눈 나머지가 0이 아닐 경우 -> 홀수인 경우
				continue;			//실행하지 않고 넘어간다.
			}
			System.out.println(i);
		}
	}
}