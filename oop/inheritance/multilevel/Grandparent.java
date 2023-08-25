package oop.inheritance.multilevel;

public class Grandparent {

	private String car_name;
	

	public Grandparent(String car_name) {
		// TODO Auto-generated constructor stub
		this.car_name=car_name;
	}
	public String getName() {
		return car_name;
	}
	
	
	
	//Registration
	private boolean isRegistered;
	
	public boolean isRegistered() {
		return isRegistered;
	}
	public void setRegistered(boolean isRegistered) {
		this.isRegistered = isRegistered;
	}

}
