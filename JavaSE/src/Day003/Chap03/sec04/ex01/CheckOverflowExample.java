package Day003.Chap03.sec04.ex01;

public class CheckOverflowExample {
	public static void main(String[] args) {
		
		try {
			
			int result = safeAdd(2000000000, 2000000000);
			
			System.out.println(result);
			
		}catch(ArithmeticException e) {
			
			System.out.println("오버 플로우가 발생하여 정확하게 계산할 수 없음.");
		}
	}
	//연산 결과 int 타입의 범위에 포함되는지 확인하는 메서드
	public static int safeAdd(int left, int right) {
		
		if((right > 0)) {
			if(left > (Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("오버 플로우 발생");
			}
		}else {
			if(left < (Integer.MIN_VALUE - right)) {
				throw new ArithmeticException("오버 플로우 발생");
			}
		}
		
		return left + right;
	}
}