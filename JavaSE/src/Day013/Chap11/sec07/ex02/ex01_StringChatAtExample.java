//String 클래스_String 메소드_문자추출 (charAt())_주민등록번호에서 성별 구분

package Day013.Chap11.sec07.ex02;

public class ex01_StringChatAtExample {
	public static void main(String[] args) {
		String ssn = "010624-1230456";
		char sex = ssn.charAt(7);
		switch(sex) {
		case '1':
		case '3':
			System.out.println("남자 입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자 입니다.");
			break;
		}
	}
}
