package Day004.Chap04.sec03.ex01;

public class ForMultiplicationTableExample {
//	public static void main(String[] args) {
//
//		for (int m = 2; m <= 9; m++) {
//			System.out.println("*** " + m + "단 ***");
//			for (int n = 1; n <= 9; n++) {
//				System.out.println(m + " x " + n + " = " + (m * n));
//			}
//		}
//	}
	
//	public static void main(String[] args) {
//		
//		for (int m = 2; m <= 9; m++) {
//			for (int n = 1; n <= 9; n++) {
//				System.out.print(m + " x " + n + " = " + (m * n) + "\t");
//			}
//			System.out.println();
//		}
//	}
	
	public static void main(String[] args) {
		
		for (int n = 1; n <= 9; n++) {
			for (int m = 2; m <= 9; m++) {
				System.out.print(m + " x " + n + " = " + (m * n) + "\t");
			}
			System.out.println();
		}
	}
}

// for 문을 활용하여 구구단을 출력
// 가로, 세로로 출력