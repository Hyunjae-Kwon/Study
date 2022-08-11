package Day015.Chap11.Example.ex08;

import java.util.StringTokenizer;

public class SplitExample {
	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";
		
		//방법 1 (split() 메소드 이용) / 코드 작성
		String[] result = str.split(",");
		
		for(int i = 0; i < result.length; i ++) {
			System.out.println(result[i]);
		}
		
		System.out.println();
		
		//방법 2 (StringTokenizer 이용) / 코드 작성
		StringTokenizer st = new StringTokenizer(str, ",");
		while(st.hasMoreTokens()) {
			String result2 = st.nextToken();
			System.out.println(result2);
		}
	}
}
