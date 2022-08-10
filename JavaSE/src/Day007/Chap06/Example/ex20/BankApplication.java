package Day007.Chap06.Example.ex20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("------------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("------------------------------------------------");
			System.out.println("선택 > ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	//계좌 생성하기
	private static void createAccount() {
		//작성 위치
		System.out.println("1. 계좌 생성");
		System.out.print("계좌 번호를 입력하세요.");
		String ano = scanner.next();
		System.out.print("예금주를 입력하세요.");
		String owner = scanner.next();
		System.out.print("초기 입금액을 입력하세요.");
		int balance = scanner.nextInt();
		
		Account newAccount = new Account(ano, owner, balance);
		for(int i = 0; i < accountArray.length; i ++) {
			if(accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("계좌가 생성되었습니다.");
				break;
			}
		}
	}
	
	//계좌 목록보기
	private static void accountList() {
		//작성 위치
		System.out.println("2. 계좌 목록");
		for(int i = 0; i < accountArray.length; i ++) {
			Account account = accountArray[i];
			if(account != null) {
				System.out.print(account.getAno());
				System.out.print("     ");
				System.out.print(account.getOwner());
				System.out.print("     ");
				System.out.print(account.getBalance());
				System.out.println();
			}
		}
	}
	
	//예금하기
	private static void deposit() {
		//작성 위치
		System.out.println("3. 예금");
		System.out.print("입금하실 계좌번호를 입력하세요.");
		String ano = scanner.next();
		System.out.print("입금하실 금액을 입력하세요.");
		int money = scanner.nextInt();
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("없는 계좌입니다.");
			return;
		}
		account.setBalance(account.getBalance() + money);

		System.out.println("예금되었습니다. 잔액은 " + account.getBalance() + "원 입니다.");
	}
	
	//출금하기
	private static void withdraw() {
		//작성 위치
		System.out.println("4. 출금");
		System.out.print("출금하실 계좌번호를 입력하세요.");
		String ano = scanner.next();
		System.out.print("출금하실 금액을 입력하세요.");
		int money = scanner.nextInt();
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("없는 계좌입니다.");
			return;
		}
		account.setBalance(account.getBalance() - money);
		System.out.println("출금되었습니다. 잔액은 " + account.getBalance() + "원 입니다.");
	}
	
	//Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		//작성 위치
		Account account = null;
		for(int i = 0; i < accountArray.length; i ++) {
			if(accountArray[i] != null) {
				String dbAno = accountArray[i].getAno();
				if(dbAno.equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}
}