package Day013.test;

import java.util.HashMap;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		String name;
		String phoneNum;
		String searchName;
		boolean run = true;
		
		Scanner sc = new Scanner(System.in);
		HashMap <String,String> hashmap = new HashMap<String,String>();
		
		System.out.println("[전화번호 저장하기]");
		System.out.print("사용자 수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i ++) {
			System.out.print("1. 이름 입력 : ");
			name = sc.next();
			System.out.print("2. 번호 입력 : ");
			phoneNum = sc.next();
			hashmap.put(name, phoneNum);
		}
		System.out.println("저장 완료!");
		
		System.out.println("[검색 하기]");
		while(run) {
			System.out.print("검색할 이름 입력 : ");
			searchName = sc.next();
			
			if(hashmap.get(searchName) != null) {
				phoneNum = hashmap.get(searchName);
				System.out.println(searchName + "씨의 번호는 " + phoneNum + "입니다.");
			} else if (searchName.equals("stop")){
				System.out.println("프로그램을 종료합니다!");
				run = false;
				break;
			} else {
				System.out.println("입력하신 이름은 존재하지 않습니다.");
			}
		}
	}
}
