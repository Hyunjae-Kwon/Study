//java.time 패키지_날짜와 시간을 조작하기_날짜와 시간 연산

package Day015.Chap11.sec16.ex03;

import java.time.LocalDateTime;

public class DateTimeOperationExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("현재시 : " + now);
		
		LocalDateTime targetDateTime = now
				.plusYears(1)
				.minusMonths(2)
				.plusDays(3)
				.plusHours(4)
				.minusMinutes(5)
				.plusSeconds(6);

		System.out.println("연산 후 : " + targetDateTime);
		
	}
}
