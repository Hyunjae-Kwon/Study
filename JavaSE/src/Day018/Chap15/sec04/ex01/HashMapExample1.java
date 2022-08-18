package Day018.Chap15.sec04.ex01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
	public static void main(String[] args) {
		//Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);	//아래와 "홍길동" 키가 같기 때문에
		map.put("동장군", 80);	
		map.put("홍길동", 95);	//제일 마지막에 저장한 값으로 대치
		System.out.println("총 Entry 수 : " + map.size());	//저장된 총 Entry 수 얻기
		
		//객체 찾기
		System.out.println("\t홍길동 : " + map.get("홍길동"));	//이름(키)으로 점수(값) 검색
		System.out.println();
		
		//방법 1. 객체를 하나씩 처리 (키 값을 모를 때)_keySet
		Set<String> keySet = map.keySet();					//Key Set 얻기
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {						//반복해서 키를 얻고
			String key = keyIterator.next();				//값을 Map 에서 얻어냄
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		//객체 삭제
		map.remove("홍길동");									//키로 Map.Entry 제거
		System.out.println("총 Entry 수 : " + map.size());
		
		//방법2. 객체를 하나씩 처리 (키 값을 모를 때)_entrySet
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();	//Map.EntrySet 얻기
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {							//반복해서 Map.Entry를 얻고
			Map.Entry<String, Integer> entry = entryIterator.next();//키와 값을 얻어냄
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		//객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수 : " + map.size());
	}
}
