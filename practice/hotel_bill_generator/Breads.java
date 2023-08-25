package practice.hotel_bill_generator;

public enum Breads {
	Plain_Naan(40,"Plain Naan","30001"),
	Butter_Naan(55,"Butter Naan","30002"),
	Plain_Tandoori_Chapati(15,"Plain Tandoori Chapati","30003"),
	Butter_Tandoori_Chapati(18,"Butter Tandoori Chapati","30004"),
	Butter_Tawa_Roti(17,"Butter Tawa Roti","30005"),
	Tawa_Roti(13,"Tawa Roti","30006");
	
	private final Integer dishPrice;
	private final String dishName;
	private final String serialNumber;
	
	private Breads(Integer dishPrice,String dishName,String serialNumber) {
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
