package Day005.javaChap05;

public class ex03 {
	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		//코드 작성
		for(int i = 0; i < arr.length; i ++) {
			sum += arr[i];
		}
		
		System.out.println("sum = " + sum);
	}
}
