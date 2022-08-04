package Day003.plusExample;

public class Operator01 {
	
	int a;
	
	public static void main(String[] args) {
		
		int i = 5;
		//i++;					 //i = i + i; 와 같은 의미. ++i; 로 바꿔 써도 결과는 같다.
		System.out.println(i++); //5
		
		i = 5;					 //결과 비교 위해 i 값 초기화
		//++i;					 //6
		System.out.println(++i); //6
	}
}