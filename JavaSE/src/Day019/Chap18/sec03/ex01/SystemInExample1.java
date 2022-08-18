package Day019.Chap18.sec03.ex01;

public class SystemInExample1 {
	public static void main(String[] args) throws Exception {
		long start = 0;
		long end = 0;

		System.out.println("== 메뉴 ==");
		System.out.println("1. 예금 조회");
		System.out.println("2. 예금 출금");
		System.out.println("3. 예금 입금");
		System.out.println("4. 종료 하기");
		System.out.print("메뉴를 선택하세요 : ");
		
//		InputStream is = System.in;
		char inputChar = (char) System.in.read();
		start = System.currentTimeMillis();
		switch(inputChar) {
		case '1' : 
			System.out.println("예금 조회를 선택하셨습니다.");
			break;
		case '2' : 
			System.out.println("예금 출금를 선택하셨습니다.");
			break;
		case '3' : 
			System.out.println("예금 입금를 선택하셨습니다.");
			break;
		case '4' : 
			System.out.println("종료 하기를 선택하셨습니다.");
			break;
		}
		end = System.currentTimeMillis();
		System.out.println((end - start) + "ms");
	}
}
