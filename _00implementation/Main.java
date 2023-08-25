package _00implementation;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the bill amount : ");
		
		int amount=input.nextInt();
		
		Upi obj=new Upi(amount);
		
		obj.getMaximumCashback();
		
		input.close();
	}

}
