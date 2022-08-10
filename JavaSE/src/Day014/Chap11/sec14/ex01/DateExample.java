//Date, Calendar 클래스_Date 클래스_현재 날짜를 출력하기

package Day014.Chap11.sec14.ex01;

import java.sql.Timestamp;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateExample {
	public static void main(String[] args) {
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strNow2 =sdf.format(now);
		System.out.println(strNow2);
		
		Calendar cc = Calendar.getInstance();
		System.out.println(cc);
		
		Timestamp tt = new Timestamp(System.currentTimeMillis());
		System.out.println(tt);
	}
}
