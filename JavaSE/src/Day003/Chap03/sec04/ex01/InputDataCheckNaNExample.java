package Day003.Chap03.sec04.ex01;

public class InputDataCheckNaNExample {
	public static void main(String[] args) {
		
		String userInput = "NaN";				//사용자로부터 입력받은 값
		double val = Double.valueOf(userInput); //입력값을 double 타입으로 변환
		
		double currentBalance = 10000.0;
		
		currentBalance += val;					//currentBalance에 NaN이 저장됨
		System.out.println(currentBalance);
	}
}