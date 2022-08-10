//Date, Calendar 클래스_Calendar 클래스_사용 가능한 시간대 문자열 출력

package Day014.Chap11.sec14.ex02;

import java.util.TimeZone;

public class PrintTimeZoneID {	
	public static void main(String[] args) {
		String[] availableIDs = TimeZone.getAvailableIDs();
		for(String id : availableIDs) {
			System.out.println(id);
		}
	}
}
