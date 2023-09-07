package practice.marriage_portal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LoginUserInterface extends User {

	private String username;
	private List<String> tempData=new ArrayList<String>();
	private String choice;
	private List<String> label = new ArrayList<String>(Arrays.asList("Gender","First Name","Last Name","Password","Age","Phone Number","Qualities","Perferences"));
	private String userPreferences;
	private List<String> tempData2=new ArrayList<String>();
	private int flag=0;
	
	private static Scanner input;
	static {
		input=new Scanner(System.in);
	}
	
	public LoginUserInterface() {
		// TODO Auto-generated constructor stub
	}
	
	
	private void searchMaleResults() {
		userPreferences=tempData.get(7);
		for(Map.Entry<String, List<String>> entry : maleUsers.entrySet()) {
			tempData2=entry.getValue();
			if(userPreferences.equalsIgnoreCase(tempData2.get(6))) {
				flag=1;
				System.out.println("Username is "+entry.getKey());
				System.out.println("First Name is "+tempData2.get(1));
				System.out.println("Last Name is "+tempData2.get(2));
				System.out.println("Age is "+tempData2.get(4));
				System.out.println("Qualities is "+tempData2.get(6));
				System.out.println("Perferences is "+tempData2.get(7));
				System.out.println("-------------------------------");
			}
		}
		if(flag==0) {
			System.out.println("No Matches");
		}
	}
	private void searchFemaleResults() {
		userPreferences=tempData.get(7);
		for(Map.Entry<String, List<String>> entry : femaleUsers.entrySet()) {
			tempData2=entry.getValue();
//			System.out.println(tempData2);
			if(userPreferences.equalsIgnoreCase(tempData2.get(6))) {
				flag=1;
				System.out.println("Username is "+entry.getKey());
				System.out.println("First Name is "+tempData2.get(1));
				System.out.println("Last Name is "+tempData2.get(2));
				System.out.println("Age is "+tempData2.get(4));
				System.out.println("Qualities is "+tempData2.get(6));
				System.out.println("Perferences is "+tempData2.get(7));
				System.out.println("-------------------------------");
			}
		}
		if(flag==0) {
			System.out.println("No Matches");
		}
	}
	
	
	protected void runMale(String username) {
		tempData=maleUsers.get(username);
		this.username=username;
		System.out.println("Kindly Select any Option");
		System.out.println("1. Search For Matches");
		System.out.println("2. ShowDetails");
		System.out.println("3. LogOut");
		choice=input.nextLine().trim();
		while(!(choice.equals("3"))) {
			if(choice.equals("1")) {
				searchFemaleResults();
			}
			else if(choice.equals("2")) {
				System.out.println("Your Username is "+username);
				for(int i=0;i<label.size();i++) {
					System.out.println("Your "+label.get(i)+ " is "+tempData.get(i));
				}
			}
			System.out.println("Kindly Select any Option");
			System.out.println("1. Search For Matches");
			System.out.println("2. ShowDetails");
			System.out.println("3. LogOut");
			choice=input.nextLine().trim();
		}
	}
	
	
	protected void runFemale(String username) {
		this.username=username;
		tempData=femaleUsers.get(username);
		System.out.println("Kindly Select any Option");
		System.out.println("1. Search For Matches");
		System.out.println("2. ShowDetails");
		System.out.println("3. LogOut");
		choice=input.nextLine().trim();
		while(!(choice.equals("3"))) {
			if(choice.equals("1")) {
				searchMaleResults();
			}		
			else if(choice.equals("2")) {
				System.out.println("Your Username is "+username);
				for(int i=0;i<label.size();i++) {
					System.out.println("Your "+label.get(i)+ " is "+tempData.get(i));
				}
			}
			System.out.println("Kindly Select any Option");
			System.out.println("1. Search For Matches");
			System.out.println("2. ShowDetails");
			System.out.println("3. LogOut");
			choice=input.nextLine().trim();
		}
	}

}
