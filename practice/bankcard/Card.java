package practice.bankcard;

public enum Card {
	DEBIT_CARD(500,50000,100000),
	CREDIT_CARD(1000,100000,200000),
	SHOPPING_CARD(2000,300000,500000),
	BUSINESS_CARD(4000,700000,1000000),
	INTERNATIONAL_CARD(8000,1000000,1500000);
	
	private final Integer annual_fee;
	private final Integer card_limit;
	private final Integer annual_salary;
	
	private Card(Integer annual_fee,Integer card_limit,Integer annual_salary) {
		this.annual_fee=annual_fee;
		this.card_limit=card_limit;
		this.annual_salary=annual_salary;
	}

	protected Integer getAnnual_fee() {
		return annual_fee;
	}

	protected Integer getCard_limit() {
		return card_limit;
	}

	protected Integer getAnnual_salary() {
		return annual_salary;
	}
	
	
}
