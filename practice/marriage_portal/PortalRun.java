package practice.marriage_portal;

import java.util.Scanner;

public class PortalRun {

	private String choice ;
	
	private static Scanner input;
	static {
		input=new Scanner(System.in);
	}
	
	public PortalRun() {
		startApp();
	}

	private void startApp() {
		System.out.println("Welcome to Shaddi.com");
		System.out.println("Kindly Select your Option :-");
		System.out.println("1. Create New Account");
		System.out.println("2. Existing User/Login");
		System.out.println("3. Exit App");
		String choice = input.nextLine().trim();
		while(!(choice.equalsIgnoreCase("3"))) {
			if( choice.equalsIgnoreCase("1")) {
				CreateNewUser newUser = new CreateNewUser();
				newUser.addUser();
			}
			else {
				LoginUser existingUser = new LoginUser();
			}
			System.out.println("Kindly Select your Option :-");
			System.out.println("1. Create New Account");
			System.out.println("2. Existing User/Login");
			System.out.println("3. Exit App");
			choice = input.nextLine().trim();
		}
	}

}
