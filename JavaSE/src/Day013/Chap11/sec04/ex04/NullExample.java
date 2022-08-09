//Objects 클래스_널 여부 조사 (isNull(), nonNull(), requireNonNull())

package Day013.Chap11.sec04.ex04;

import java.util.Objects;

public class NullExample {
	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = null;
		
		System.out.println(Objects.requireNonNull(str1));
		
		try {
			String name = Objects.requireNonNull(str2);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			String name = Objects.requireNonNull(str2, "이름이 없습니다.");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			String name = Objects.requireNonNull(str2, ()->"이름이 없다니깐요");	   //람다식
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
