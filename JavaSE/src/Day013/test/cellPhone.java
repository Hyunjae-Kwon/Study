package Day013.test;

import java.util.Scanner;

public class cellPhone {
	private static phoneNumber[] pnArray = new phoneNumber[2];
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		boolean run = true;
		while(run) {
			System.out.println("1. 번호 저장 2. 번호 목록 3. 번호 검색 4. 종료");
			System.out.print("선택 > ");
			
			int number = sc.nextInt();
			
			if (number == 1) {
				saveNumber();
			} else if (number == 2) {
				numberList();
			} else if (number == 3) {
				searchName();
			} else if (number == 4) {
				run = false;
			}
		}
		System.out.println("핸드폰 종료");
	}
	
	private static void saveNumber() {
		System.out.print("저장하실 이름을 입력하세요.");
		String name = sc.next();
		System.out.print("저장하실 번호를 입력하세요.");
		String pn = sc.next();
		
		phoneNumber newpn = new phoneNumber(name, pn);
		for(int i = 0 ; i < pnArray.length; i ++) {
			if(pnArray[i] == null) {
				pnArray[i] = newpn;
				System.out.println("번호 저장 완료");
				break;
			}
		}
	}
	private static void numberList() {
		for(int i = 0; i < pnArray.length; i ++) {
			phoneNumber phonenumber = pnArray[i];
			if(phonenumber != null) {
				System.out.print(phonenumber.getName());
				System.out.print("   ");
				System.out.print(phonenumber.getPn());
				System.out.println();
			}
		}
	}
	private static void searchName() {
		System.out.print("검색하실 이름을 입력하세요.");
		String name = sc.next();
		phoneNumber phonenumber = findNumber(name);
		if (phonenumber == null) {
			System.out.println("없는 이름입니다.");
			return;
		} else {
			System.out.println("번호를 찾았습니다.");
			System.out.print(phonenumber.getName());
			System.out.print("   ");
			System.out.print(phonenumber.getPn());
			System.out.println();
		}
	}
	private static phoneNumber findNumber(String name) {
		phoneNumber phonenumber = null;
		for(int i = 0; i < pnArray.length; i ++) {
			if(pnArray[i] != null) {
				String dbName = pnArray[i].getName();
				if(dbName.equals(name)) {
					phonenumber = pnArray[i];
					break;
				}
			}
		}
		return phonenumber;
	}
}
