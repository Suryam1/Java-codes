package practice.bankcard;

public class Customer {

	private String customerName;
	private Integer customerSalaray;
	
	
	public Customer(String customerName,Integer customerSalaray) {
		// TODO Auto-generated constructor stub
		this.customerName=customerName;
		this.customerSalaray=customerSalaray;
	}


	protected String getCustomerName() {
		return customerName;
	}


	protected Integer getCustomerSalaray() {
		return customerSalaray;
	}
	
	

}
