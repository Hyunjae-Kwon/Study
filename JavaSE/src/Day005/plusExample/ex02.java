//문자 10개를 저장할 수 있는 배열을 선언하고 10개의 문자를 입력받아 입력받은 문자를 이어서 출력하는 프로그램

package Day005.plusExample;

import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		
		String[] array = new String[10];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 10; i ++) {
			array[i] = sc.next();
			System.out.print(array[i]);
		}
	}
}
