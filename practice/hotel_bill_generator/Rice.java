package practice.hotel_bill_generator;

public enum Rice {
	Veg_Briyani(170,"Veg Briyani","40001"),
	Veg_Pulao(150,"Veg Pulao","40002"),
	Kashmir_Pulao(170,"Kashmir Pulao","40003"),
	Jeera_Rice(110,"Jeera Rice","40004"),
	Plain_Rice(80,"Plain Rice","40005");
	
	private final Integer dishPrice;
	private final String dishName;
	private final String serialNumber;
	
	private Rice(Integer dishPrice,String dishName,String serialNumber) {
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
