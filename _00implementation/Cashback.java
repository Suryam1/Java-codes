package _00implementation;

public class Cashback implements AmazonPay,GooglePay,PhonePay,Paytm {

	@Override
	public int getPatymCashback() {
		// TODO Auto-generated method stub
		return PATYM_CASHBACK;
	}

	@Override
	public int getPhoneCashback() {
		// TODO Auto-generated method stub
		return PHONE_CASHBACK;
	}

	@Override
	public int getGoogleCashback() {
		// TODO Auto-generated method stub
		return GOOGLE_CASHBACK;
	}

	@Override
	public int getAmazonCashback() {
		// TODO Auto-generated method stub
		return AMAZON_CASHBACK;
	}

	

}
