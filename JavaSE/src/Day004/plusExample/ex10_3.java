package Day004.plusExample;

import java.util.Scanner;

public class ex10_3 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int N = 100;
		
		for(int i = 0; i <= N; i ++) {
			make_prime(i);
		}
	}
	
	public static void make_prime(int number) {
		if(number < 2) {
			return;
		}
		if(number == 2) {
			System.out.println(number);
			return;
		}
		for(int i = 2; i < number; i ++) {
			if(number % i == 0) {
				return;
			}
		}
		System.out.println(number);
		return;
	}
}