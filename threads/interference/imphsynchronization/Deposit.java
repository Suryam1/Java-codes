package threads.interference.imphsynchronization;



public class Deposit implements Runnable {

	private Double amount;
	private Transaction objT;
	
	public Deposit(Transaction objT,Double amount) {
		// TODO Auto-generated constructor stub
		this.objT=objT;
		this.amount=amount;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		objT.depositTransactionService(amount);
	}

}
