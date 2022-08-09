//StringTokenizer 클래스_split() 메소드_문자열 분리

package Day013.Chap11.sec08.ex01;

public class StringSplitExample {
	public static void main(String[] args) {
		String text = "홍길동&이수홍,박연수,김자바-최명호";
		
		String[] names = text.split("&|,|-");
		
		for(String name : names) {
			System.out.println(name);
		}
	}
}
