package practice.hotel_bill_generator;

import java.util.Scanner;

public class Main_Run {
	
	//Fields Decelerations
	private Scanner input = new Scanner(System.in);
	private String name;
	private String phoneNumber;
	private String choice;
	
	
	//Getters
	private String getName() {
		return name;
	}
	private String getPhoneNumber() {
		return phoneNumber;
	}
	private String getChoice() {
		return choice;
	}

	
	//Method to run Application
	protected void run(){
		
		System.out.println("Welcome To The Royal Lounge");
		
		//Enter Name
		System.out.print("Enter Your Name : ");
		this.name=input.nextLine();
		
		//Enter Phone Number
		System.out.print("Enter Your Phone Number : ");
		this.phoneNumber=input.nextLine();
		
		//Enter Choice
		System.out.println("Enter Your Choice :- ");
		System.out.println("1. Show Menu");
		System.out.println("2. Place Order");
		System.out.println("3. Get Bill");
		System.out.println("4. Pay Bill");
		this.choice=input.nextLine();
		
		//We Make Customer Object
		Customer customer = new Customer(getName(),getPhoneNumber());
		
		//Here we Look for Choices
		//Loop is false when we need to Pay Bill or select Pay Bill
		while(!(getChoice().equalsIgnoreCase("4"))) {
			
			//Make an Object of Hotel Bill Provider
			Hotel_Bill_Provider hotel = new Hotel_Bill_Provider();
			
			//Condition to Show Menu
			if(getChoice().equalsIgnoreCase("1")) {
				hotel.ShowMenu();
			}
			
			//Condition to Place Order
			else if(getChoice().equalsIgnoreCase("2")) {
				customer.placeOrder();
			}
			
			//Condition to Show Bill
			else if(getChoice().equalsIgnoreCase("3")) {
				customer.showBill();
			}
			
			//Enter Choice to Keep in program
			System.out.println("Enter Your Choice :- ");
			System.out.println("1. Show Menu");
			System.out.println("2. Place Order");
			System.out.println("3. Get Bill");
			System.out.println("4. Pay Bill");
			this.choice=input.nextLine();
		}
		
		//Logic for Making Payment
		//First we are Showing Bill again
		customer.showBill();
		
		//Used to select Payment Methords
		System.out.println("Choose Payment Methord");
		System.out.println("1. Cash");
		System.out.println("2. Card");
		System.out.println("3. UPI");
		this.choice=input.nextLine();
		
		//Here we proceed to Pay Bill
		customer.payBill(choice);
		
		//After Bill Payment we show some messages
		System.out.println("Thanks for visiting at The Royal Lounge");
		System.out.println("Please visit again!!!!!!");
	}

}
