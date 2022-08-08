package Day004.Chap04.sec03.ex01;

public class ForSumFrom1To100Example {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 1; i <= 100; i ++) {
			sum = sum + i; // sum += i;
		}
		System.out.println("1~100 합 : " + sum);
	}
}

//for 문을 활용하여 1부터 100까지 합을 출력