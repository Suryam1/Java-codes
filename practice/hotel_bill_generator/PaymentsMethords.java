package practice.hotel_bill_generator;

import java.util.Scanner;

@UpiInterface
public class PaymentsMethords implements PaymentDetails,CashInterface,CardInterface,UPInterface {

	//Fields Decelerations
	
	private Integer totalBillAmount;
	private String userCashAmount;
	private Integer temp;
	
	private Integer flag=0;
	
	
	private String cardHolderName;
	private String cardNumber;
	private String expiryDate;
	private String cvvNumber;
	private String cardPin;
	
	
	private String upiId;
	private String upiPin;
	
	//Payment method object is made to apply Marker Interface
	Scanner input=new Scanner(System.in);
	PaymentsMethords tempObj;
	
	//PaymentMethods Constructor
	public PaymentsMethords(Integer totalBillAmount) {
		this.totalBillAmount=totalBillAmount;
	}
	public PaymentsMethords() {
		// TODO Auto-generated constructor stub
	}

	//Method used for Cash Payment
	protected void cash() {
		
		//We Checked for Marker Interface
			
			//We show bill amount to user and take amount input from user
			System.out.println("Your Total Bill Amount : "+totalBillAmount);
			System.out.print("Kindly Pay the Amount : ");
			userCashAmount=input.nextLine();
			temp=Integer.parseInt(userCashAmount);
			
			//While amount user paid is less than total Bill we show user to pay Bill again with full price
			//If amount user paid is sufficient enough the we simply pay bill
			while(temp<totalBillAmount) {
				System.out.println("Amount paid is less than the bill amount kindly pay the total bill!!!!!");
				System.out.println("Your Total Bill Amount : "+totalBillAmount);
				System.out.print("Kindly Pay the Amount Again : ");
				userCashAmount=input.nextLine();
				temp=Integer.parseInt(userCashAmount);
			}
			//We show success Message and tell user to collect Change
			System.out.println("Thanks for paying the Bill");
			System.out.println("Kindly Collect your Change : Rs."+(temp-totalBillAmount));
		}
	
	
	//Method used for card payment
	protected void card() {
		
		//We Check for Marker Interface
			System.out.println("Your Total Bill Amount : "+totalBillAmount);
			
			//Loop keep running until all user card data entered matched with actual data
			//As soon all data matched and user make payment this loop becomes false
			while(flag==0) {
				
				//Input taken for Card Holder Name
				System.out.print("Kindly Enter Card Holder Name : ");
				cardHolderName=input.nextLine();
				
				//We Check card Name entered value with original value
				if(cardHolderName.equalsIgnoreCase(CARDHOLDERNAME)) {
					
					//Input taken for Card Number
					System.out.print("Enter Card Number : ");
					cardNumber=input.nextLine();
					
					//We check card number entered value with original value
					if(cardNumber.equalsIgnoreCase(CARDNUMBER)) {
						
						//Input taken for Card Expiry Date
						System.out.print("Enter Card Expiry Date (In Format DD/MM/YYYY): ");
						expiryDate=input.nextLine();
						
						//We check card expiry date entered value with original value
						if(expiryDate.equalsIgnoreCase(EXPIRYDATE)) {
							
							//Input taken for CVV number
							System.out.print("Enter Card CVV Number : ");
							cvvNumber=input.nextLine();
							
							//We check for CVV entered with original value
							if(cvvNumber.equalsIgnoreCase(CVV)) {
								
								//We check for account balance
								if(totalBillAmount<=BALANCE) {
									
									//Input taken for PIN
									System.out.print("Kindly Enter Your Card Pin : ");
									cardPin=input.nextLine();
									
									//We check PIN entered with original PIN
									if(cardPin.equalsIgnoreCase(CARDPIN)) {
										System.out.println("Thanks for paying the Bill");
										flag=1;
									}
									
									//If PIN not Matched
									else {
										System.out.println("Your Card Pin is Not Right.");
										System.out.println("Kindly Enter Your Details Again!!!");
									}
								}
								
								//If account balance is not sufficient
								else {
									System.out.println("Your Account Balance is Not Sufficient");
									System.out.println("Kindly Enter Your Details Again!!!");
								}
							}
							
							//If CVV is not matched
							else {
								System.out.println("Card CVV Number is Not Right.");
								System.out.println("Kindly Enter Your Details Again!!!");
							}
						}
						
						//If Expiry date is not matched
						else {
							System.out.println("Card Expiry Date is Not Right.");
							System.out.println("Kindly Enter Your Details Again!!!");
						}
					}
					
					//If card number not Matched
					else {
						System.out.println("Card Number is Not Right.");
						System.out.println("Kindly Enter Your Details Again!!!");
					}
				}
				
				//If card holder name not matched
				else {
					System.out.println("Card Holder Name is Not Right.");
					System.out.println("Kindly Enter Your Details Again!!!");
				}
				
			}
		}
	
	//Method used for UPI Payment
	protected void UPI() {
		
		//Check for Marker Interface for UPI Payment
		//System.out.println("Hi");
			
			//We show total Bill amount to user
			System.out.println("Your Total Bill Amount : "+totalBillAmount);
			
			//Loop keep running and matches user data entered with real data
			//If data matched we came out of loop
			//If not matched we keep on looping until we get right details
			while(flag==0) {
				
				//Input taken for UPI ID
				System.out.print("Kindly Enter Your UPI ID : ");
				upiId=input.nextLine();
				
				//We check UPI ID entered with original UPI ID
				if(upiId.equalsIgnoreCase(UPIID)) {
					
					//Input taken for UPI PIN
					System.out.print("Kindly Enter Your UPI PIN : ");
					upiPin=input.nextLine();
					
					//We check for UPI PIN entered with original UPI PIN
					if(upiPin.equalsIgnoreCase(UPIPIN)) {
						
						//We Check for Account Balance
						if(totalBillAmount<=BALANCE) {
							System.out.println("Thannks for Paying The Bill.");
							flag=1;
						}
						
						//If account balance is not sufficient
						else {
							System.out.println("Your Account Balance is Not Sufficient.");
							System.out.println("Kindly Enter Your Details Again!!!");
						}
					}
					
					//If UPI PIN is not valid
					else {
						System.out.println("UPI PIN is Not Right.");
						System.out.println("Kindly Enter Your Details Again!!!");
					}
				}
				
				//If UPI ID is not valid
				else {
					System.out.println("UPI ID is Not Right.");
					System.out.println("Kindly Enter Your Details Again!!!");
				}
			}
		}
	}
