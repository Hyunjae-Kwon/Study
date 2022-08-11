//java.time 패키지_파싱과 포맷팅_문자열 파싱

package Day015.Chap11.sec16.ex05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeParsingExample {
	public static void main(String[] args) {
		DateTimeFormatter formatter;
		LocalDate localDate;
		
		localDate = LocalDate.parse("2024-05-21");
		System.out.println(localDate);
		
		formatter = DateTimeFormatter.ISO_LOCAL_DATE;
		localDate = LocalDate.parse("2024-05-21", formatter);
		System.out.println(localDate);
		
		formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		localDate = LocalDate.parse("2024/05/21", formatter);
		System.out.println(localDate);
		
		formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		localDate = LocalDate.parse("2024.05.21", formatter);
		System.out.println(localDate);
	}
}
