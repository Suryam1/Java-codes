package practice.marriage_portal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public abstract class User {

	protected static HashMap<String, List<String>> maleUsers;
	protected static HashMap<String, List<String>> femaleUsers;
	
	
	private static List<String> tempMale1= new ArrayList<String>(Arrays.asList("Male","Aayush","Khosla","3210987654321","20","7894561230","Gym Lover","Dance"));
	private static List<String> tempMale2= new ArrayList<String>(Arrays.asList("Male","Satvik","Bharadwaj","3210987654321","22","7894561230","Basketball","Youtuber"));
	private static List<String> tempMale3= new ArrayList<String>(Arrays.asList("Male","Suryam","Bhukania","3210987654321","23","7894561230","Coding","Cooking"));
	private static List<String> tempMale4= new ArrayList<String>(Arrays.asList("Male","Aniket","Kumar","3210987654321","21","7894561230","Basketball","Reader"));
	private static List<String> tempMale5= new ArrayList<String>(Arrays.asList("Male","Saurabh","Shukla","3210987654321","25","7894561230","Designer","Cooking"));
	
	
	private static List<String> tempFemale1= new ArrayList<String>(Arrays.asList("Female","Aayushi","Khosla","3210987654321","25","7894561230","Dance","Gym Lover"));
	private static List<String> tempFemale2= new ArrayList<String>(Arrays.asList("Female","Tashu","Kashyap","3210987654321","24","7894561230","Youtuber","Basketball"));
	private static List<String> tempFemale3= new ArrayList<String>(Arrays.asList("Female","Shreshtra","Pareek","3210987654321","21","7894561230","Cooking","Coding"));
	private static List<String> tempFemale4= new ArrayList<String>(Arrays.asList("Female","Ishani","Thakur","3210987654321","23","7894561230","Reader","Basketball"));
	private static List<String> tempFemale5= new ArrayList<String>(Arrays.asList("Female","Shwetakshi","Priya","3210987654321","22","7894561230","Cooking","Designer"));
	

	
	static {
		maleUsers = new HashMap<String, List<String>>();
		
		femaleUsers = new HashMap<String, List<String>>();
		
		maleUsers.put("Aayush", tempMale1);
		maleUsers.put("Satvik", tempMale2);
		maleUsers.put("Suryam", tempMale3);
		maleUsers.put("Aniket", tempMale4);
		maleUsers.put("Saurabh", tempMale5);
		
		femaleUsers.put("Aayushi", tempFemale1);
		femaleUsers.put("Tashu", tempFemale2);
		femaleUsers.put("Shreshtra", tempFemale3);
		femaleUsers.put("Ishani", tempFemale4);
		femaleUsers.put("Shwetakshi", tempFemale5);
	}
	
	
	protected boolean checkMaleUser(String username) {
		// TODO Auto-generated method stub
		if(maleUsers.containsKey(username)) {
			return true;
		}
		return false;
	}
	
	protected boolean checkFemaleUser(String username) {
		// TODO Auto-generated method stub
		if(femaleUsers.containsKey(username)) {
			return true;
		}
		return false;
	}
	
	protected boolean checkPassword(String password) {
		if(password.length()<12) {
			System.out.println("Password is Not Valid Length should be Minimum 12 Characters.");
			return true;
		}
		else {
			System.out.println("Password is Valid.");
			return false;
		}
	}
	
	protected String encryptPassword(String password) {
		StringBuffer encryptedPassword = new StringBuffer(password);
		encryptedPassword.reverse();
		return encryptedPassword.toString();
	}

}
