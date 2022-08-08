package Day004.plusExample;

public class ex12 {
	public static void main(String[] args) {
		
		int count = 0;
		
		for(int i = 0; i <=10000; i ++) {
			
			int temp = i;					//i가 변질되는 것을 방지하기 위에 변수 temp에 저장
			
			while(true) {
				if(temp % 10 == 8) {		//10으로 나누어 나머지가 8이면 카운트
					count++;
				}
				if(temp >= 10) {			
					temp = temp / 10;		//10보다 크면 1의 자리 수 제거 한 후 temp를 다시 올려보냄
				} else if(temp < 10) {		//만약 i 값이 8 이어도 위에서 카운트하기 때문에 break
					break;
				}							//temp의 1의 자리 깎기 중단하고 다음 수로 넘어감.
			}
		}
		System.out.println("1에서 10,000 사이에 존재하는 8의 개수는 : " + count);
	}
}