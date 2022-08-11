//java.time 패키지_파싱과 포맷팅_포맷팅 문자열

package Day015.Chap11.sec16.ex05;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
//		System.out.println(now);
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일 a h시 m분");
		String nowString = now.format(dateTimeFormatter);
		System.out.println(nowString);
	}
}
