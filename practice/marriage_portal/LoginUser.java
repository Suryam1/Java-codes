package practice.marriage_portal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LoginUser extends User {

	private String tempUsername;
	private String tempPassword;
	private String encryptedPassword;
	private List<String> tempData;
	private String choice;
	private List<String> label = new ArrayList<String>(Arrays.asList("Gender","First Name","Last Name","Password","Age","Phone Number","Qualities","Perferences"));
	
	private static Scanner input;
	static {
		input=new Scanner(System.in);
	}
	
	public LoginUser() {
		// TODO Auto-generated constructor stub
		checkUser();
		
	}

	private void checkUser() {
		// TODO Auto-generated method stub
		System.out.print("Kindly Enter Your UserName :- ");
		tempUsername=input.nextLine();
		if(checkMaleUser(tempUsername)) {
			System.out.println("Kindly Enter Your Password :- ");
			tempPassword=input.nextLine();
			encryptedPassword=encryptPassword(tempPassword);
			tempData = new ArrayList<>();
			tempData=maleUsers.get(tempUsername);
			if(encryptedPassword.equals(tempData.get(3))) {
				System.out.println("You Successfully Logged In");
				LoginUserInterface maleUserInterface = new LoginUserInterface();
				maleUserInterface.runMale(tempUsername);
			}
			else {
				System.out.println("Password is Wrong Kindly Login Again");
			}
		}
		else if(checkFemaleUser(tempUsername)) {
			System.out.println("Kindly Enter Your Password :- ");
			tempPassword=input.nextLine();
			encryptedPassword=encryptPassword(tempPassword);
			tempData = new ArrayList<>();
			tempData=femaleUsers.get(tempUsername);
			if(encryptedPassword.equals(tempData.get(2))) {
				System.out.println("You Successfully Logged In");
				LoginUserInterface femaleUserInterface = new LoginUserInterface();
				femaleUserInterface.runFemale(tempUsername);
			}
			else {
				System.out.println("Password is Wrong Kindly Login Again");
			}
		}
		else {
			System.out.println("User Dont Exist Kindly Register First");
			return;
		}
	}

}
