//String 클래스_String 메소드_문자열 길이(length())_문자열의 문자 수 얻기

package Day013.Chap11.sec07.ex02;

public class ex05_StringLengthExample {
	public static void main(String[] args) {
		String ssn = "1234456678412";
		int length = ssn.length();
		if(length == 13) {
			System.out.println("주민번호 자리수가 맞습니다.");
		} else {
			System.out.println("주민번호 자리수가 틀립니다.");
		}
	}
}
