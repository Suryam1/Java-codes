package oop.inheritance.multilevel;
import java.util.Scanner;

/*
 * Grandparent bought a car - HONDA / Registration
 * 
 * Father got this car from his father - Re-registered
 * 
 * Child got this same car from his father - Modified
 * 
 * 
 */



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Car Name : ");
		String car_name=input.next();
		Child obj=new Child(car_name);
		System.out.println(obj.getName());
		
		//Take input for Registration of car from user
		System.out.println("Did you Registered the car?");
		String regestraion=input.next();
		
		//Check for Registration of car
		if(regestraion.equals("YES")||regestraion.equals("yes")) {
			obj.setRegistered(true);
			System.out.println("Congratulations! Registration is Successful");
				
			//Take input for Re-Registration of car from user
			System.out.println("Did you Re-Registered the car?");
			String re_Registration=input.next();
			
			//Check for Re-Registration of Car
			if(re_Registration.equals("YES")||re_Registration.equals("yes")) {
				obj.setReRegistration(true);
				System.out.println("Congratulations! Re-Registration is Successful");
				
				//Take input for Modification of car from user
				System.out.println("Did you modify the car?");
				String s_modified=input.next();
				
				//Check for Modification of Car
				if(s_modified.equals("YES")||s_modified.equals("yes")) {
					//If car is modified
					obj.setModified(true);
					System.out.println("Great Job!");
				}
				
				else if(s_modified.equals("NO")||s_modified.equals("no")) {
					//If car is not Modified
					obj.setModified(false);
					System.out.println("No problem, you can do it now.");
				}
				
			}
			
			else if(re_Registration.equals("NO")||re_Registration.equals("no")) {
				//If car is not Re-registered
				obj.setReRegistration(false);
				System.out.println("Car is not Re-Registered!");
				System.out.println("First Re-register car then only you can modify it.");
			}
			
		}
		else if(regestraion.equals("NO")||regestraion.equals("no")) {
			//If car is not Registered
			obj.setRegistered(false);
			System.out.println("Car is not Registered!");
			System.out.println("First Register car then only you can Re-register and modify it.");
		}
		
		input.close();
	}

}
