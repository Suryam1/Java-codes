package practice.hotel_bill_generator;

public enum Main_Course {
	Dal_Fry(100,"Dal Fry","20001"),
	Dal_Tadka(150,"Dal Tadka","20002"),
	Malai_Kofta(150,"Malai Kofta","20003"),
	Malai_Pyaz(160,"Malai Pyaz","20004"),
	Malai_Sev(90,"Malai Sev","20005"),
	Paneer_Butter_Masala(200,"Paneer Butter Masala","20006"),
	Paneer_Tikka_Masala(190,"Paneer Tikka Masala","20007"),
	Shahi_Paneer(180,"Shahi Paneer","20008"),
	Kadai_Paneer(210,"Kadai Paneer","20009");
	
	private final Integer dishPrice;
	private final String dishName;
	private final String serialNumber;
	
	private Main_Course(int dishPrice,String dishName,String serialNumber) {
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
