package Day004.plusExample;

public class ex10 {
	public static void main(String[] args) {
		
		//소수인지 알고자 하는 숫자 선언 및 값 저장
		int num = 863;
		//num이 소수인지 구하기
		for(int i = 2; i <= num; i ++) {
			
			//2이상의 숫자 중에서 863이 아닌데 나눴을 때 나머지가 없는 수가 있는지 확인
			if(num != i && num % i == 0) {	//나머지가 0인 경우가 있다. -> 소수가 아님.
				System.out.println(num + "은(는) 소수가 아닙니다.");
			}else if(num == i) {			//위 조건문에서 충족하는 경우가 없다. -> 소수임.
				System.out.println(num + "은(는) 소수입니다.");
			}
		}
		//2~100 사이의 소수 구하기
		for(int i = 2; i <= 100; i ++) {
			for(int j = 2; j <= i; j ++) {
				if(i != j && i%j == 0) {
					break;
				}
				if(i == j) {
						System.out.println(i + "은(는) 소수입니다.");
				}
			}
		}
	}
}