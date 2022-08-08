package Day004.Chap04.sec03.ex04;

public class BreakExample {
	public static void main(String[] args) throws Exception{
		//main 메소드를 실행하다보면 Exception 이 발생할 수 있다. 이 때
		while(true) {
			int num = (int)(Math.random()*6) +1;
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}