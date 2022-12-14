package Day018.Chap15.Example.ex09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("whilte", 92);
		
		String name = null;		//최고 점수를 받은 아이디 저장
		int maxScore = 0;		//최고 점수 저장
		int totalScore = 0;		//점수 합계 저장
		
		//코드 작성
		
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		for(Map.Entry<String, Integer> entry : set) {
			if(entry.getValue() > maxScore) {
				name = entry.getKey();
				maxScore = entry.getValue();
			}
			totalScore += entry.getValue();
		}

		int avg = totalScore / map.size();
		System.out.println("평균 점수 : " + avg);
		System.out.println("최고 점수 : " + maxScore);
		System.out.println("최고 점수를 받은 아이디 : " + name);
	}
}
