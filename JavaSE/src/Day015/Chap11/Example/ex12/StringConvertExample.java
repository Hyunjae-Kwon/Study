package Day015.Chap11.Example.ex12;

public class StringConvertExample {
	public static void main(String[] args) {
		String strData1 = "200";
		int intData1 = Integer.parseInt(strData1);	//코드 작성
		
		int intData2 = 150;
		String strData2 = String.valueOf(intData2); //코드 작성
		
		System.out.println(intData1 + "   " + strData2);
	}
}
