//Date, Calendar 클래스_Calendar 클래스_다른 시간대에 해당하는 날짜와 시간 출력

package Day014.Chap11.sec14.ex02;

import java.util.Calendar;
import java.util.TimeZone;

public class TimeZoneCalenderExample {
	public static void main(String[] args) {
		Calendar cc = Calendar.getInstance();
		int year = cc.get(Calendar.YEAR);
		int month = cc.get(Calendar.MONTH) + 1;
		int day = cc.get(Calendar.DAY_OF_MONTH);
		int hour = cc.get(Calendar.HOUR);
		int minute = cc.get(Calendar.MINUTE);
		int second = cc.get(Calendar.SECOND);
		
		int amPm = cc.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		
		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.println(day + "일 ");
		System.out.print(strAmPm + " ");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.println(second + "초 ");
		
		System.out.println();
		
		TimeZone tz = TimeZone.getTimeZone("America/Argentina/Buenos_Aires");
		Calendar cc2 = Calendar.getInstance(tz);
		year = cc2.get(Calendar.YEAR);
		month = cc2.get(Calendar.MONDAY) + 1;
		day = cc2.get(Calendar.DAY_OF_MONTH);
		
		amPm = cc2.get(Calendar.AM_PM);
		String strAmPm2 = null;
		if(amPm == Calendar.AM) {
			strAmPm2 = "오전";
		} else {
			strAmPm2 = "오후";
		}
		
		hour = cc2.get(Calendar.HOUR);
		minute = cc2.get(Calendar.MINUTE);
		second = cc2.get(Calendar.SECOND);
		
		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.println(day + "일 ");
		System.out.print(strAmPm2 + " ");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.println(second + "초 ");
	}
}
