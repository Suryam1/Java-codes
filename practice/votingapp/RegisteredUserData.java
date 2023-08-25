package practice.votingapp;

public class RegisteredUserData {
	
	private String id,name,age,country;
	private boolean voteCasted=false;
	private String partyVoted="";
		
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public boolean isVoteCasted() {
		return voteCasted;
	}

	public void setVoteCasted(boolean voteCasted) {
		this.voteCasted = voteCasted;
	}
	
	public String getPartyVoted() {
		return partyVoted;
	}

	public void setPartyVoted(String partyVoted) {
		this.partyVoted = partyVoted;
	}

	public RegisteredUserData(String id,String name,String age,String country) {
		// TODO Auto-generated constructor stub
		setId(id);
		setName(name);
		setAge(age);
		setCountry(country);
	}

}
