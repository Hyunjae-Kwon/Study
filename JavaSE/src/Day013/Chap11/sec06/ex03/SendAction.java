//Class 클래스_동적 객체 생성 (newInstance())_발신 클래스

package Day013.Chap11.sec06.ex03;

public class SendAction implements Action {
	@Override
	public void execute() {
		System.out.println("데이터를 보냅니다.");
	}
}
