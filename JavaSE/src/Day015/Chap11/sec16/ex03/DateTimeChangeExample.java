//java.time 패키지_날짜와 시간을 조작하기_날짜와 시간 변경

package Day015.Chap11.sec16.ex03;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class DateTimeChangeExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("현재 : " + now);
		
		LocalDateTime targetDateTime = null;
		
		//직접 변경
		targetDateTime = now
				.withYear(2023)
				.withMonth(3)
				.withDayOfMonth(3)
				.withHour(21)
				.withMinute(40)
				.withSecond(0);
		System.out.println("직접 변경 : " + targetDateTime);
		
		//년도 상대 변경
		targetDateTime = now.with(TemporalAdjusters.firstDayOfNextYear());
		System.out.println("이번 해의 첫 일 : " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("이번 해의 마지막 일 : " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.firstDayOfNextYear());
		System.out.println("다음 해의 첫 일 : " + targetDateTime);
		
		//월 상대 변경
		targetDateTime = now.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("이번 달의 첫 일 : " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("이번 달의 마지막 일 : " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("다음 달의 첫 일 : " + targetDateTime);
		
		//요일 상대 변경
		targetDateTime = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println("이번 달의 첫 월요일 : " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		System.out.println("돌아오는 월요일 : " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
		System.out.println("지난 월요일 : " + targetDateTime);
	}
}
