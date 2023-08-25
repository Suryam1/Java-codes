package exceptions.example;

import java.util.Scanner;

public class FlightBooking {

	private String flightNo;
	private String flightName;
	
	public FlightBooking() {
		// TODO Auto-generated constructor stub
		
	}
	
	private String getFlightNo() {
		return flightNo;
	}
	private void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	private String getFlightName() {
		return flightName;
	}
	private void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Flight Number : ");
		String flightNo = input.nextLine().trim();
		
		System.out.print("Enter Flight Name : ");
		String flightName = input.nextLine().trim();
		FlightBooking obj = new FlightBooking();
		
		try {
			obj.setFlightNo(flightNo);
			obj.setFlightName(flightName);
		}
		catch (NullPointerException n){
			System.out.println("Flight Number or Name cant be Null");
		}
		catch (Exception e){
			System.out.println("Exception Raised");
		}
		finally {
			System.out.println(obj.getFlightNo()+" "+obj.getFlightName());
		}
		
	}

}
