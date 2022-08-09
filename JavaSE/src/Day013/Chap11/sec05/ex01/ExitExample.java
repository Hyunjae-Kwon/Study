//System클래스_프로그램종료 exite 메소드

package Day013.Chap11.sec05.ex01;

public class ExitExample {
	public static void main(String[] args) {
		//보안 관리자 설정
		System.setSecurityManager(new SecurityManager(){
			@Override
			public void checkExit(int status) {
				if(status != 5) {
					throw new SecurityException();
				}
			}
		});
		
		for(int i = 0; i < 10; i ++) {
			//i값 출력
			System.out.println(i);
			try {
				//JVM 종로 요청
				System.exit(i);
			} catch(SecurityException e) {}
		}
	}
}
