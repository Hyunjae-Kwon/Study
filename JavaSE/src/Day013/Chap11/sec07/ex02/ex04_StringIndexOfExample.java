//String 클래스_String 메소드_문자열 찾기(indexOf())_문자열 포함 여부 조사

package Day013.Chap11.sec07.ex02;

public class ex04_StringIndexOfExample {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		if(subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책입니다.");
		} else {
			System.out.println("자봐와 관련없는 책입니다.");
		}
	}
}
