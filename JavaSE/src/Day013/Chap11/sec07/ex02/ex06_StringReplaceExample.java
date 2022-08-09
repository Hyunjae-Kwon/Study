//String 클래스_String 메소드_문자열 대치(replace())

package Day013.Chap11.sec07.ex02;

public class ex06_StringReplaceExample {
	public static void main(String[] args) {
		String oldstr = "자바는 객체지향언어 입니다. 자바는 풍부한 API를 지원합니다.";
		String newstr = oldstr.replace("자바", "JAVA");
		System.out.println(newstr);
	}
}
