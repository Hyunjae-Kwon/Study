package Day005.javaChap05;

public class ex08 {
	public static void main(String[] args) {
		
		int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
		int[] counter = new int[4];
		
		for(int i = 0; i < answer.length; i ++) {
			//코드 작성
			counter [answer[i] - 1] ++; 
			// counter [ answer[0] - 1 ] ++; counter[0]++; [1, 0, 0, 0]
			// counter [ answer[1] - 1 ] ++; counter[3]++; [1, 0, 0, 1]
			// counter [ answer[2] - 1 ] ++; counter[3]++; [1, 0, 0, 2]
			// counter [ answer[3] - 1 ] ++; counter[2]++; [1, 0, 1, 2]
			// counter [ answer[4] - 1 ] ++; counter[0]++; [2, 0, 1, 2]
			// counter [ answer[5] - 1 ] ++; counter[3]++; [2, 0, 1, 3]
			//~
			// [3, 2, 2, 4]
		}
		
		for(int i = 0; i < counter.length; i ++) {
			//코드 작성
			System.out.print(counter[i]);
			
			for(int j = 0; j < counter[i]; j ++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
