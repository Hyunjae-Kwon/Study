package Day005.Chap05.sec06.ex06;

public class MainStringArrayArgument {
	public static void main(String[] args) {
		
		if(args.length != 2) {
			System.out.println("프로그램의 사용법");
			System.out.println("java MainStringArrayArgument num1 num2");
			System.exit(0);
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}
}
//값을 넣어서 확인하는 방법
//run - run configurations - arguments - program arguments 에 숫자 2개 입력
