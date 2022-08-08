package Day004.plusExample;

public class ex05 {
	public static void main(String[] args) {

//		int sum = 0;
//		
//		for(int i = 1; i <= 200; i ++) {
//			if(i%2 == 0 || i%3 == 0) {
//				continue;
//			}
//			sum += i;
//		}
//		System.out.println(sum);
//	}		//13
		int sum = 0;

		for (int i = 1; i <= 200; i++) {
			if (i % 2 != 0 && i % 3 != 0) { 
				sum += i;
			}
		}
		System.out.println(sum);
	}
}