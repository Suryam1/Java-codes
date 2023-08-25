package oop.abstraction.advanced;

public class Platform extends AbstractPlatforms {

	
	
	public Platform(String name) {
		super(name);
		System.out.println("Social Media Platforms");
		
	}
	
	
	public void setPlatformUrl(String url) {
		setUrl(url);
	}
	
	public void setPlatformCountry(String country) {
		setCountry(country);
	}
	public void setPlatformFounder(String founder) {
		setFounder(founder);
	}
	public void setPlatformFoundedDate(String foundedDate) {
		setFoundedDate(foundedDate);
	}

	public void getAllPlatformDetails() {
		// TODO Auto-generated method stub
		System.out.println("\n \n All Platform Details : ");
		
		System.out.println(getName());
		System.out.println(getUrl());
		System.out.println(getCountry());
		System.out.println(getFounder());
		System.out.println(getFoundedDate());
	}




	
}
