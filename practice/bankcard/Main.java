package practice.bankcard;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String customerName;
		Integer customerSalaray;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Kindly Enter your Name : ");
		customerName=input.nextLine();
		System.out.print("Kindly Enter you Monthly Salary (Minimun Slaray Should be Rs 1,00,000 ) : ");
		customerSalaray=input.nextInt();
		
		Customer customer = new Customer(customerName,customerSalaray);
		
		BankCardProvider card_objcet = new BankCardProvider(customer);
		
		card_objcet.isApplicationVaild();
		if(card_objcet.getIsApplicable()) {
			card_objcet.checkCard();
		}
		else {
			System.out.println("Your Salary is less than Minimum Salary");
		}
	}

}
