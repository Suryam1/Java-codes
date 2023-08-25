package practice.hotel_bill_generator;

public class Hotel_Bill_Provider {
	
	//Constructor
	public Hotel_Bill_Provider() {
		// TODO Auto-generated constructor stub
	}
	
	//Method used to show Menu to the customer
	protected void ShowMenu() {
		
		System.out.println("\t\tMENU\n");
		System.out.println("------------------------------------------------------");
		
		System.out.println("STARTERS");
		System.out.println("SerialNo.\tDish Name\tPrice");
		for (Starters starter:Starters.values()) {
			System.out.println(starter.getSerialNumber()+"\t"+starter.getDishName()+"\tRs."+starter.getDishPrice());
		}
		
		System.out.println();
		System.out.println("------------------------------------------------------");
		
		System.out.println("MAIN COURSE");
		System.out.println("SerialNo.\tDish Name\tPrice");
		for (Main_Course main_course:Main_Course.values()) {
			System.out.println(main_course.getSerialNumber()+"\t"+main_course.getDishName()+"\tRs."+main_course.getDishPrice());
		}
		
		System.out.println();
		System.out.println("------------------------------------------------------");
		
		System.out.println("BREADS");
		System.out.println("SerialNo.\tDish Name\tPrice");
		for(Breads breads:Breads.values()) {
			System.out.println(breads.getSerialNumber()+"\t"+breads.getDishName()+"\tRs."+breads.getDishPrice());
		}
		
		System.out.println();
		System.out.println("------------------------------------------------------");
		
		System.out.println("RICE");
		System.out.println("SerialNo.\tDish Name\tPrice");
		for(Rice rice:Rice.values()) {
			System.out.println(rice.getSerialNumber()+"\t"+rice.getDishName()+"\tRs."+rice.getDishPrice());
		}
		
		System.out.println();
		System.out.println("------------------------------------------------------");
		
		System.out.println("Accompaniments");
		System.out.println("SerialNo.\tDish Name\tPrice");
		for (Accompaniments accompaniments:Accompaniments.values()) {
			System.out.println(accompaniments.getSerialNumber()+"\t"+accompaniments.getDishName()+"\tRs."+accompaniments.getDishPrice());
		}
		
		System.out.println();
		System.out.println("------------------------------------------------------");
		
	}

}
