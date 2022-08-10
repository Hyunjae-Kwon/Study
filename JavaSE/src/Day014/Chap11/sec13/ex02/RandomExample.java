//Math, Random 클래스_Random 클래스_로또 번호 얻기

package Day014.Chap11.sec13.ex02;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		//선택 번호
		int[] selectNumber = new int[6];		//선택 번호 6개가 저장될 배열 생성
		Random random = new Random(3);			//seed 가 3인 난수를 얻기 위한 Random 객체 생성
		System.out.print("선택 번호 : ");
		for(int i = 0; i < 6; i ++) {
			selectNumber[i] = random.nextInt(45) + 1;		//선택 번호를 얻어 배열에 저장
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		
		//당첨 번호
		int [] winnerNumber = new int[6];		//당첨 번호 6개가 저장될 배열 생성
		random = new Random(5);					//당첨 번호를 얻기 위한 객체 생성 (seed = 5)
		System.out.print("당첨 번호 : ");
		for(int i = 0; i < 6; i ++) {
			winnerNumber[i] = random.nextInt(45) + 1;	//당첨 번호를 얻어 배열에 저장
			System.out.print(winnerNumber[i] + " ");
		}
		System.out.println();
		
		//당첨 여부
		Arrays.sort(selectNumber);	//비교하기 전 정렬
		Arrays.sort(winnerNumber);
		boolean result = Arrays.equals(selectNumber, winnerNumber);		//배열 항목 값 비교
		System.out.print("당첨 여부 : ");
		if(result) {
			System.out.println("1등에 당첨되었습니다.");
		} else {
			System.out.println("당첨되지 않았습니다.");
		}
	}
}
