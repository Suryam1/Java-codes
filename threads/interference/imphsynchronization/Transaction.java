package threads.interference.imphsynchronization;
public class Transaction {

	public static final int DELAY=5000;
	Account account;
	
	public Transaction() {
		// TODO Auto-generated constructor stub
		account=new Account();
	}
	
	//public void depositTransactionService(Double amount) {
	public synchronized void depositTransactionService(Double amount) {
		System.out.println("Before Deposit : "+account.getBalance());
		
		Double balance = account.getBalance()+amount;
		
		account.setBalance(balance);
		
		try {
			Thread.sleep(DELAY);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("After Deposit : "+account.getBalance());
	}
	
	
	//public void withdrwalTransactionService(Double amount) {
	public synchronized void withdrwalTransactionService(Double amount) {
		System.out.println("Before Withdraw : "+account.getBalance());
		
		Double balance = account.getBalance()-amount;
		
		account.setBalance(balance);
		
		try {
			Thread.sleep(DELAY);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("After Withdraw : "+account.getBalance());
	}

}
