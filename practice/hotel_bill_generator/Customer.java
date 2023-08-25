package practice.hotel_bill_generator;

import java.util.Scanner;

@UpiInterface
public class Customer {

	//Fields Decelerations
	private String name;
	private String phoneNumber;
	private String[] orderedItems = new String[100];
	private Integer[] orderedItemsQuantity = new Integer[100];
	private Integer numberOfDishes=0;
	private String temp;
	private Integer totalBillAmount=0;
	private Integer flag=0;
	
	//Scanner object to take input
	private Scanner input = new Scanner(System.in);
	
	//Constructor
	public Customer(String name,String phoneNumber) {
		this.name=name;
		this.phoneNumber=phoneNumber;
	}
	
	//Method use to Place Order
	protected void placeOrder() {
		
		//We type dish Serial Number we want to order
		System.out.print("Enter Dish SerialNo. (To Exit Type Place Order) : ");
		this.temp=input.nextLine();
		
		//Loop keep running until we type place order
		//As soon as we type place order loop is false and order is placed
		while(!(temp.equalsIgnoreCase("Place Order"))) {
			
			//Here we check whether the dish serial Number we entered is right or not
			//If dish valid loop become false else loop break;
			while(flag==0) {
				//We Check in Starters Enum
				for (Starters starter:Starters.values()) {
					if(temp.equalsIgnoreCase(starter.getSerialNumber())) {
						flag=1;
					}
				}
				
				//We Check in Main Course Enum
				for (Main_Course main_course:Main_Course.values()) {
					if(temp.equalsIgnoreCase(main_course.getSerialNumber())) {
						flag=1;
					}
				}
				
				//We Check In Breads Enum
				for (Breads breads : Breads.values()) {
					if(temp.equalsIgnoreCase(breads.getSerialNumber())) {
						flag=1;
					}
				}
				
				//We Check in Rice Enum
				for (Rice rice : Rice.values()) {
					if(temp.equalsIgnoreCase(rice.getSerialNumber())) {
						flag=1;
					}
				}
				
				//We Check in Accompaniments Enum
				for (Accompaniments accompaniments : Accompaniments.values()) {
					if(temp.equalsIgnoreCase(accompaniments.getSerialNumber())) {
						flag=1;
					}
				}
				
				//If no value matched then we show some messages and repeat the process
				if(flag==0) {
					System.out.println("Kindly Enter Dish Serial Number Properly");
					System.out.print("Enter Dish SerialNo. (To Exit Type Place Order) : ");
					temp=input.nextLine();
				}
				
				//If value entered is place order we simply break
				if(temp.equalsIgnoreCase("Place Order")) {
					break;
				}
			}
			
			//If value entered is place order we simply break
			if(temp.equalsIgnoreCase("Place Order")) {
				break;
			}
			
			//Here we take quantity and store it in declared fields
			orderedItems[numberOfDishes]=temp;
			System.out.print("Enter Quantity : ");
			orderedItemsQuantity[numberOfDishes]=Integer.parseInt(input.nextLine());
			numberOfDishes++;
			flag=0;
			System.out.print("Enter Dish Name(To Exit Type Place Order) : ");
			temp=input.nextLine();
		}
		
		//Successful Order Placed Message
		System.out.println("Your Order is SuccessFully Placed");
	}
	
	//Method used to Show Bill to the Customer
	protected void showBill() {
		
		
		System.out.println("Hello "+name);
		System.out.println("This is your Total Bill");
		
		//We take values from dish user ordered 
		for(Integer i=0;i<numberOfDishes;i++) {
			
			//We check for those values in each enum to calculate total amount and show it to the user
			//Here we look in Starter Enum
			for(Starters starter : Starters.values()) {
				if(starter.getSerialNumber().equalsIgnoreCase(orderedItems[i])) {
					totalBillAmount=totalBillAmount+(orderedItemsQuantity[i]*starter.getDishPrice());
					System.out.println(starter.getDishName()+"\t"+orderedItemsQuantity[i]+"*"+starter.getDishPrice()+"\tRs."+(orderedItemsQuantity[i]*starter.getDishPrice()));
				}
			}
			
			//Here we look in Main Course Enum
			for (Main_Course main_course:Main_Course.values()) {
				if(main_course.getSerialNumber().equalsIgnoreCase(orderedItems[i])) {
					totalBillAmount=totalBillAmount+(orderedItemsQuantity[i]*main_course.getDishPrice());
					System.out.println(main_course.getDishName()+"\t"+orderedItemsQuantity[i]+"*"+main_course.getDishPrice()+"\tRs."+(orderedItemsQuantity[i]*main_course.getDishPrice()));
				}
			}
			
			//Here we look in Breads Enum
			for (Breads breads : Breads.values()) {
				if(breads.getSerialNumber().equalsIgnoreCase(orderedItems[i])) {
					totalBillAmount=totalBillAmount+(orderedItemsQuantity[i]*breads.getDishPrice());
					System.out.println(breads.getDishName()+"\t"+orderedItemsQuantity[i]+"*"+breads.getDishPrice()+"\tRs."+(orderedItemsQuantity[i]*breads.getDishPrice()));
				}
			}
			
			//Here we look in Rice Enum
			for (Rice rice : Rice.values()) {
				if(rice.getSerialNumber().equalsIgnoreCase(orderedItems[i])) {
					totalBillAmount=totalBillAmount+(orderedItemsQuantity[i]*rice.getDishPrice());
					System.out.println(rice.getDishName()+"\t"+orderedItemsQuantity[i]+"*"+rice.getDishPrice()+"\tRs."+(orderedItemsQuantity[i]*rice.getDishPrice()));
				}
			}
			
			//Here we look in Accompaniments Enum
			for (Accompaniments accompaniments : Accompaniments.values()) {
				if(accompaniments.getSerialNumber().equalsIgnoreCase(orderedItems[i])) {
					totalBillAmount=totalBillAmount+(orderedItemsQuantity[i]*accompaniments.getDishPrice());
					System.out.println(accompaniments.getSerialNumber()+"\t"+orderedItemsQuantity[i]+"*"+accompaniments.getDishPrice()+"\tRs."+(orderedItemsQuantity[i]*accompaniments.getDishPrice()));
				}
			}
			
		}
		
		//Message to show total Bill Amount
		System.out.println("So Your Total Order Amount is Rs."+totalBillAmount);
	}
	
	//Get Method to get total Bill Amount
	protected Integer getTotalBillAmount() {
		return totalBillAmount;
	}
	
	//Pay Bill Method used to Pay Bill
	protected void payBill(String choice) {
		
		//Payment Method object used to use various payment methods
		PaymentsMethords payment = new PaymentsMethords(totalBillAmount);
		
		//This choice is for cash payment
		if(choice.equalsIgnoreCase("1")&& (payment instanceof CashInterface)) {
			payment.cash();
		}
		
		//This choice is for Card payment
		else if(choice.equalsIgnoreCase("2")&& (payment instanceof CardInterface)) {
			payment.card();
		}
		
		//This choice is for UPI payment
		else if(choice.equalsIgnoreCase("3")&& (payment.getClass().isAnnotationPresent(UpiInterface.class))) {
			payment.UPI();
		}
	}

}
