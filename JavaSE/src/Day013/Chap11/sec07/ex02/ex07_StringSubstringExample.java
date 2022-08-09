//String 클래스_String 메소드_문자열 잘라내기(substring())_문자열 추출하기

package Day013.Chap11.sec07.ex02;

public class ex07_StringSubstringExample {
	public static void main(String[] args) {
		String ssn = "456789-1234567";
		
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	}
}
