//5개 정수를 입력받은 후 차례로 출력하는 프로그램

package Day005.plusExample;

import java.util.Scanner;

public class ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[5];

		for(int i = 0; i < 5; i ++) {
			array[i] = sc.nextInt();
			System.out.print(array[i] + " ");
		}
	}
}
