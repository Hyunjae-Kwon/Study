package Day004.Chap04.sec02.ex05;

public class SwitchStringExample {
	public static void main(String[] args) {
		
		String position = "과장";
		
		switch(position) {
		case "부장":
			System.out.println("700만원");
			break;
			
		case "과장":
			System.out.println("500만원");
			break;
			
		default:
			System.out.println("300만원");
		}
	}
}

//직급별 급여 출력