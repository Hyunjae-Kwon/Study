//String 클래스_String 메소드_문자열 앞뒤 공백 잘라내기(trim())

package Day013.Chap11.sec07.ex02;

public class ex09_StringTrimExample {
	public static void main(String[] args) {
		String tel1 = " 02";
		String tel2 = "123   ";
		String tel3 = "   1234    ";
		
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);
	}
}
