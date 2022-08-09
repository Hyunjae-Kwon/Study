//Objects 클래스_객체 문자 정보(toString())

package Day013.Chap11.sec04.ex05;

import java.util.Objects;

public class ToStringExample {
	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = null;
		
		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str2));
		System.out.println(Objects.toString(str2, "이름이 없습니다."));
	}
}
