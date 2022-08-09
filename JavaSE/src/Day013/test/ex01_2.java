package Day013.test;

import java.util.Scanner;

public class ex01_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("난수의 개수를 입력하세요.");
		int count = sc.nextInt();	//난수의 개수
		int sum = 0;				//난수의 합
		int[] arr = new int[count];	//난수의 배열
		System.out.print("출력된 난수 : ");
		for(int i = 0; i < arr.length; i ++) {
			arr[i] = (int)(Math.random()*45 + 1);
			sum += arr[i];
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
		System.out.println("난수의 총합 : " + sum);
	}
}
