package practice.hotel_bill_generator;

public enum Starters {
	Paneer_Tikka_Masala(250,"Paneer Tikka Masala","10001"),
	French_Fries(120,"French Fries","10002"),
	Hara_Bhara_Kebab(150,"Hara Bhara Kebab","10003");
	
	private final Integer dishPrice;
	private final String dishName;
	private final String serialNumber;
	
	private Starters(Integer dishPrice,String dishName,String serialNumber) {
		this.dishPrice=dishPrice;
		this.dishName=dishName;
		this.serialNumber=serialNumber;
	}
	
	protected Integer getDishPrice() {
		return dishPrice;
	}
	
	protected String getDishName() {
		return dishName;
	}
	
	protected String getSerialNumber() {
		return serialNumber;
	}
	
}
