package practice.marriage_portal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class CreateNewUser extends User {

	private String choice;
	private String username;
	private List<String> label = new ArrayList<String>(Arrays.asList("Gender","First Name","Last Name","Password","Age","Phone Number","Qualities","Perferences"));
	private List<String> temp;
	private String passwordTemp;
	private String encryptedPassword;
	
	private static Scanner input;
	static {
		input=new Scanner(System.in);
	}
	
	public CreateNewUser() {
		// TODO Auto-generated constructor stub
		temp=new ArrayList<String>();
	}

	protected void addUser() {
		// TODO Auto-generated method stub
		System.out.print("Kindly Enter Your Gender :- ");
		choice = input.nextLine().trim();
		
		if(choice.equalsIgnoreCase("Male")) {
			temp= new ArrayList<String>();
			temp.add(choice);
			System.out.println("Kindly Enter Your UserName");
			username=input.nextLine().trim();
			while(checkMaleUser(username)) {
				System.out.println("UserName Exist Kindly Choose Unique UserName");
				System.out.println("Kindly Enter Your UserName Again");
				username=input.nextLine().trim();
			}
			for (String x : label ) {
				if(x.equalsIgnoreCase("Password")) {
					System.out.println("Kinldy Enter Your "+x+" (Minimum Length Should be 12 Charcters):- ");
					passwordTemp=input.nextLine();
					while(checkPassword(passwordTemp)) {
						System.out.println("Kinldy Enter Your "+x+" (Minimum Length Should be 12 Charcters):- ");
						passwordTemp=input.nextLine();
					}
					encryptedPassword=encryptPassword(passwordTemp);
					temp.add(encryptedPassword);
				}
				else if(x.equalsIgnoreCase("Gender")) {
					continue;
				}
				else {
					System.out.print("Kinldy Enter Your "+x+" :- ");					
					temp.add(input.nextLine());
				}
			}
			maleUsers.put(username, temp);
			System.out.println("User Successfully Registered");
		}
		else {
			temp= new ArrayList<String>();
			temp.add(choice);
			System.out.println("Kindly Enter Your UserName");
			username=input.nextLine().trim();
			while(checkFemaleUser(username)) {
				System.out.println("UserName Exist Kindly Choose Unique UserName");
				System.out.println("Kindly Enter Your UserName Again");
				username=input.nextLine().trim();
			}
			for (String x : label ) {
				if(x.equalsIgnoreCase("Password")) {
					System.out.println("Kinldy Enter Your "+x+" (Minimum Length Should be 12 Charcters):- ");
					passwordTemp=input.nextLine();
					while(checkPassword(passwordTemp)) {
						System.out.println("Kinldy Enter Your "+x+" (Minimum Length Should be 12 Charcters):- ");
						passwordTemp=input.nextLine();
					}
					encryptedPassword=encryptPassword(passwordTemp);
					temp.add(encryptedPassword);
				}
				else if(x.equalsIgnoreCase("Gender")) {
					continue;
				}
				else{
					System.out.print("Kinldy Enter Your "+x+" :- ");					
					temp.add(input.nextLine());
				}
			}
			femaleUsers.put(username, temp);
			System.out.println("User Successfully Registered");
		}
		
	}


}
