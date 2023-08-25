package practice.hotel_bill_generator;

public enum Accompaniments {
	Veg_Raita(50,"Veg Raita","50001"),
	Boondi_Raita(60,"Boondi Raita","50002"),
	Onion_Raita(50,"Onion Raita","50003"),
	Fruit_Raita(105,"Fruit Raita","50004"),
	Plain_Dahi(40,"Plain Dahi","50005"),
	Masala_Papad(40,"Masala Papad","50006"),
	Papad(30,"Papad","50007");
	
	private final Integer dishPrice;
	private final String dishName;
	private final String serialNumber;
	
	private Accompaniments(Integer dishPrice,String dishName,String serialNumber) {
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
