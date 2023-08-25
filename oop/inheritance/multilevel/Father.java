package oop.inheritance.multilevel;

public class Father extends Grandparent {
	private boolean reRegistration;
	
	
	public Father(String car_name) {
		super(car_name);
	}
	
	//ReRegistration
	public boolean isReRegistration() {
		return reRegistration;
	}

	public void setReRegistration(boolean reRegistration) {
		this.reRegistration = reRegistration;
	}

}
