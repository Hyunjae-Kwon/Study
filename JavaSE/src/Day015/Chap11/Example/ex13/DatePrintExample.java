package Day015.Chap11.Example.ex13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrintExample {
	public static void main(String[] args) {
		Date now = new Date();
		
		//여기서 코드를 작성하세요.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분");
		String result = sdf.format(now);
		System.out.println(result);
	}
}
