package threads.interference.imphsynchronization;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transaction objT = new Transaction();
		
		double amountToDeposit=100;
		double amountToWithdraw=500;
		
		Deposit objDT = new Deposit(objT, amountToDeposit);
		Withdrawal objWT = new Withdrawal(objT, amountToWithdraw);
		
		Thread husband = new Thread(objDT);
		Thread wife = new Thread(objWT);
		
		husband.start();
		wife.start();
	}

}
