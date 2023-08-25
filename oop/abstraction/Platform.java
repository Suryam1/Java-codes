package oop.abstraction;

public class Platform extends Linkedin {

	
	
	public Platform(String name) {
		super(name);
		System.out.println("Social Media Platforms");
		
	}

	
	public String getPlatformName() {
		String name=getName();
		return name;
	}

	public void getLinkedinDetails() {
		// TODO Auto-generated method stub
		System.out.println("GetLinkedinDetails()");
	}

	
}
