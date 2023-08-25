package _00implementation;
public class Upi extends Cashback  {
	
	private int amount;
	private int finalAmount;
	private int amazonCashback;
	private int googleCashback;
	private int phoneCashback;
	private int paytmCashback;

	public Upi(int amount) {
		this.amount=amount;
	}
	
	public int getMaximumCashback() {
		amazonCashback=getAmazonCashback();
		googleCashback=getGoogleCashback();
		phoneCashback=getPhoneCashback();
		paytmCashback=getPatymCashback();
		
		if( amazonCashback>googleCashback && amazonCashback>phoneCashback && amazonCashback>paytmCashback) {
			
			System.out.println("Congratulations! You got "+amazonCashback+" Rs Cashback from AmazonPay.");
			finalAmount=amount-amazonCashback;
			System.out.println("Your final bill amount after cashback is "+finalAmount+" Rs.");
			
		}
		
		else if( googleCashback>amazonCashback && googleCashback>phoneCashback && googleCashback>paytmCashback) {
			
			System.out.println("Congratulations! You got "+googleCashback+" Rs Cashback from GooglePay.");
			finalAmount=amount-googleCashback;
			System.out.println("Your final bill amount after cashback is "+finalAmount+" Rs.");
			
		}
		
		else if( phoneCashback>amazonCashback && phoneCashback>googleCashback&& phoneCashback>paytmCashback) {
			
			System.out.println("Congratulations! You got "+phoneCashback+" Rs Cashback from PhonePay.");
			finalAmount=amount-phoneCashback;
			System.out.println("Your final bill amount after cashback is "+finalAmount+" Rs.");
		
		}
		
		else {
			
			System.out.println("Congratulations! You got "+paytmCashback+" Rs Cashback from Paytm.");
			finalAmount=amount-paytmCashback;
			System.out.println("Your final bill amount after cashback is "+finalAmount+" Rs.");
		
		}
		
		return 0;
	}
	
	
	

	

}
