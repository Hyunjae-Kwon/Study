package Day005.Chap05.Example;

import java.util.Scanner;

public class ex09 {
	public static void main(String[] args) {

		boolean run = true; // 반복문의 조건

		int studentNum = 0; // 학생 수
		int[] scores = null; // 점수

		Scanner scanner = new Scanner(System.in); // 키보드로 입력한 값을 처리하기 위해서 작성

		while (run) {
			System.out.println("----------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수 입력 | 3. 점수 리스트 | 4. 분석 | 5. 종료");
			System.out.println("----------------------------------------------------");
			System.out.println("선택 > ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.println("학생 수를 입력하세요.");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			} else if (selectNo == 2) {
				for(int i = 0; i < scores.length; i ++) {
					System.out.println("점수를 순서대로 입력하세요.");
					System.out.print("scores[" + i + "] > ");
					scores[i] = scanner.nextInt();
				}
			} else if (selectNo == 3) {
				for(int i = 0; i < scores.length; i ++) {
					System.out.println(scores[i]);
				}
			} else if (selectNo == 4) {
				//최고 점수 및 평균 점수
				int max = 0;
				int sum = 0;
				double avg = 0.0;
				
				for(int i = 0; i < scores.length; i ++) {
					max = (max < scores[i]) ? scores[i] : max;
					sum += scores[i];
					avg = (double)sum / studentNum;
				}
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + avg);
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}