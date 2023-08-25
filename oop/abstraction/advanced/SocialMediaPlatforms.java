package oop.abstraction.advanced;

public interface SocialMediaPlatforms {
	public static final String COMPANY_NAME="LINKEDIN";
	
	/*	private String name;
		private String foundedDate;
		private String url;
		private String country;
		private String founder;
	 */
	
	
	public String getName();
	public void setName(String name);
	
	public String getUrl();
	public void   setUrl(String url);
	
	public String getCountry();
	public void setCountry(String country);
	
	public String getFounder();
	public void setFounder(String founder);
	
	public String getFoundedDate();
	public void setFoundedDate(String foundedDate);
}
