package practice.marriage_portal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public abstract class User {

	protected static HashMap<String, List<String>> maleUsers;
	protected static HashMap<String, List<String>> femaleUsers;
	private static List<String> tempMale= new ArrayList<String>(Arrays.asList("Male","Satvik","Bharadwaj","3210987654321","20","7894561230","XYZ","ABC"));
	private static List<String> tempFemale= new ArrayList<String>(Arrays.asList("Female","Aayushi","Khosla","3210987654321","25","7894561230","ABC","XYZ"));
	

	
	static {
		maleUsers = new HashMap<String, List<String>>();
		
		femaleUsers = new HashMap<String, List<String>>();
		
		maleUsers.put("Satvik", tempMale);
		femaleUsers.put("Aayushi", tempFemale);
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
