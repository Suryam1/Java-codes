package oop.abstraction.advanced;

/*
 * 
 * Abstract
 * 
 * 
 * 
 * 
 * 
 */


public abstract class AbstractPlatforms implements SocialMediaPlatforms{

	
	private String name;
	private String foundedDate;
	private String url;
	private String country;
	private String founder;
	
	public AbstractPlatforms(String name) {
		System.out.println("Social Media Platforms - Linkedin");
		this.name=name;
	}

	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url=url;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country=country;
	}
	
	public String getFounder() {
		return founder;
	}
	public void setFounder(String founder) {
		this.founder=founder;
	}
	
	public String getFoundedDate() {
		return foundedDate;
	}
	public void setFoundedDate(String foundedDate) {
		this.foundedDate=foundedDate;
	}
	
	
	
	public abstract void getAllPlatformDetails();

}
