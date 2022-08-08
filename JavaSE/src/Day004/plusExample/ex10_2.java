package Day004.plusExample;

import java.util.Scanner;

public class ex10_2 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("소수를 판별할 숫자를 입력하세요.");
		is_prime(in.nextInt());
	}
	
	public static void is_prime(int number) {
		
		if(number < 2) {
			System.out.println("소수가 아닙니다.");
			return;
		}
		
		if(number == 2) {
			System.out.println("소수입니다.");
			return;
		}
		
		for(int i = 2; i < number; i ++) {
			if(number%i == 0) {
				System.out.println("소수가 아닙니다.");
				return;
			}
		}
		System.out.println("소수입니다.");
		return;
	}
}