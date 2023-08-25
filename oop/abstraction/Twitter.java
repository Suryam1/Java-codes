package oop.abstraction;

public abstract class Twitter {

	private static final String COMPANY_NAME="LINKEDIN";
	private String name;
	private String foundedDate;
	private String url;
	private String country;
	private String founder;
	
	public Twitter(String name) {
		System.out.println("Social Media Platforms - Linkedin");
		this.name=name;
	}

	
	public String getName() {
		return name;
	}
	
	public abstract void getTwitterDetails();

}
