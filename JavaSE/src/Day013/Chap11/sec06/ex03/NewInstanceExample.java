//Class 클래스_동적 객체 생성 및 실행 (newInstance())

package Day013.Chap11.sec06.ex03;

public class NewInstanceExample {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("Day013.Chap11.sec06.ex03.SendAction");
			Class clazz2 = Class.forName("Day013.Chap11.sec06.ex03.RecieveAction");
			RecieveAction action = (RecieveAction) clazz2.newInstance();
			action.execute();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
