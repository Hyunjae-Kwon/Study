package Day017.Chap15.sec02.ex01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java");				//add 메소드 : 객체 저장
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		int size = list.size();			//size 메소드 : 객체 크기
		System.out.println("총 객체수 : " + size);
		System.out.println(list);
		System.out.println();
		
		String skill = list.get(2);		//get 메소드 : 객체 꺼내기 / 2번 인덱스의 객체 꺼내기
		System.out.println("2 : " + skill);
		System.out.println();
		
		for(int i = 0; i < list.size(); i ++) {		//저장된 총 객체 수만큼 루핑
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();
		
		list.remove(2);					//remove : 객체 지우기	/ Database 삭제됨
		list.remove(2);					//Servlet/JSP 삭제됨
		list.remove("iBATIS");
		
		for(int i = 0; i < list.size(); i ++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
	}
}
