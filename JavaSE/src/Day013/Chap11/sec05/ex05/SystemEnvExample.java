//System클래스_환경 변수 읽기 (getenv())_JAVA_HOME 환경 변수 값 얻기

package Day013.Chap11.sec05.ex05;

public class SystemEnvExample {
	public static void main(String[] args) {
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println("JAVA_HOME : " + javaHome);
	}
}
