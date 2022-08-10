package Day007.Chap06.Example.ex19;

public class Account {
	//코드 작성
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance < Account.MIN_BALANCE || balance > Account.MAX_BALANCE) {
			return;
		}
		this.balance = balance;
	}
}