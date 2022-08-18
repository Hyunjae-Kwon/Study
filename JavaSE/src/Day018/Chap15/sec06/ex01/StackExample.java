package Day018.Chap15.sec06.ex01;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.add(new Coin(100));
		coinBox.add(new Coin(50));
		coinBox.add(new Coin(500));
		coinBox.add(new Coin(10));
		
		while(!coinBox.isEmpty()) {			//동전케이스가 비었는지 확인
			Coin coin = coinBox.pop();		//동전케이스에서 제일 위의 동전 꺼내기
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
		}
	}
}
