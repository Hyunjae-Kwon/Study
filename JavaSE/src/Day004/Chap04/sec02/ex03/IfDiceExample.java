package Day004.Chap04.sec02.ex03;

public class IfDiceExample {
	public static void main(String[] args) {

		int num = (int) (Math.random() * 6) + 1;

		if (num == 1) {
			System.out.println("1번이 나왔습니다.");
		} else if (num == 2) {
			System.out.println("2번이 나왔습니다.");
		} else if (num == 3) {
			System.out.println("3번이 나왔습니다.");
		} else if (num == 4) {
			System.out.println("4번이 나왔습니다.");
		} else if (num == 5) {
			System.out.println("5번이 나왔습니다.");
		} else if (num == 6) {
			System.out.println("6번이 나왔습니다.");
		}
	}
}

//if else if else 를 활용하여 주사위의 번호를 출력하는 문제 작성