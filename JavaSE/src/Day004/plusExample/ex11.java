package Day004.plusExample;

public class ex11 {
	public static void main(String[] args) {
		
		int num1 = 0;	//첫번째와 두번째 값이 1이어야 하므로 초기값을 0과
		int num2 = 1;	//1로 줌
		int num3 = 0;
		System.out.println(num1 + ", " + num2);
		
		for(int i = 1; i < 10; i ++) {
			//System.out.println(sum + " ");
			num3 = num1 + num2;	//두 값을 더한 후
			num1 = num2;		//num2 값을 num1 로 넘겨줌
			num2 = num3;		//두번째 연산자에 더한 값을 넣어줌
			System.out.println(num3);	//sum 값 변하는 것 관찰용
		}
		System.out.println("10번째 수는 : " + num3);
	}
}