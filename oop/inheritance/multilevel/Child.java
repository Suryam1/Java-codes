package oop.inheritance.multilevel;

public class Child extends Father{
	
	private boolean isModified;

	public Child(String car_name) {
		super(car_name);
	}

	public boolean isModified() {
		return isModified;
	}

	public void setModified(boolean isModified) {
		this.isModified = isModified;
	}
	
	

}
