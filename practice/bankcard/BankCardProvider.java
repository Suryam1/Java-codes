package practice.bankcard;

public class BankCardProvider {

	private Integer MIN_SALARY=100000;
	private Customer customer;
	private Boolean isApplicable;
	
	private Card validCard;
	
	public BankCardProvider(Customer customer) {
		// TODO Auto-generated constructor stub
		this.customer=customer;
	}
	
	protected void isApplicationVaild() {
		if(customer.getCustomerSalaray()>=MIN_SALARY) {
			isApplicable=true;
		}
		else {
			isApplicable=false;
		}
	}

	protected Boolean getIsApplicable() {
		return isApplicable;
	}
	
	protected void checkCard() {
		System.out.println("All available cards are as follows :- ");
		System.out.println("Card Name\t\tAnnual Fees\tCard Limit\tAnnual Salary");
		for (Card card:Card.values()) {
			System.out.println(card+"\t\t"+card.getAnnual_fee()+"\t\t"+card.getCard_limit()+"\t\t"+card.getAnnual_salary());
			if(customer.getCustomerSalaray()>=card.getAnnual_salary()) {
				validCard=card;
			}
		}
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("The Card you are eligible for is "+validCard);
		System.out.println("Annual Fee of Card is "+validCard.getAnnual_fee());
		System.out.println("Card Limit is "+validCard.getCard_limit());
	}
	
	

}
