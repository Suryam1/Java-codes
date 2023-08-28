package threads.interference.imphsynchronization;

public class Withdrawal implements Runnable{

	private Double amount;
	private Transaction objT;
	
	public Withdrawal(Transaction objT,Double amount) {
		// TODO Auto-generated constructor stub
		this.objT=objT;
		this.amount=amount;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		objT.withdrwalTransactionService(amount);
	}

}
