package threads.interference.imphsynchronization;

public class Account {

	public static Double balance = (double)1000;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public static Double getBalance() {
		return balance;
	}

	public static void setBalance(Double balance) {
		Account.balance = balance;
	}

	
}
