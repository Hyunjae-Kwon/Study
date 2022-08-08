package Day005.Chap05.sec06.ex03;

public class ArrayCreateByValueListExample2 {
	public static void main(String[] args) {
		
		int[] scores;
		scores = new int[] {83, 90, 87};
		
		int sum1 = 0;
		for(int i = 0; i < 3; i ++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);
		
		int sum2 = add(new int[] {83, 90, 87});
		
		System.out.println("총합 : " + sum2);
		System.out.println();
	}
	
	public static int add(int[] scores) {
		int sum = 0;
		for(int i = 0; i < 3; i ++) {
			sum += scores[i];
		}
		return sum;
	}
}

//public static int add(int[] scores){ // add 메소드 선언 static 이 들어가면 메소드 메모리에 올라간다.
//메소드를 만들어 놓으면 간편한 배열 선언으로 작업 가능
