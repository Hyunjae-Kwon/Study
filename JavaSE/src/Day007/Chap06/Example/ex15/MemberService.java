package Day007.Chap06.Example.ex15;

public class MemberService {
	//작성 위치
	boolean login(String id, String password) {
		if(id == "hong" && password == "12345") {
			return true;
		} else {
			return false;
		}
	}
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
