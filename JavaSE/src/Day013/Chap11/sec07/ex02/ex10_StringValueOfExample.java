//String 클래스_String 메소드_문자열변환 (valueOf())_ 기본 타입 값을 문자열로 변환

package Day013.Chap11.sec07.ex02;

public class ex10_StringValueOfExample {
	public static void main (String[] args) {
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(10.5);
		String str3 = String.valueOf(true);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}
