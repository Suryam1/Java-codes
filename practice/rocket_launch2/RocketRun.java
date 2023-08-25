package practice.rocket_launch2;
import java.util.Scanner;
public class RocketRun {

	private int days;
	
	private int getDays() {
		return days;
	}

	private void setDays(int days) {
		this.days = days;
	}

	public RocketRun() {
		// TODO Auto-generated constructor stub
	}
	
	public void runRocket() {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the estimated days of mission : ");
		setDays(input.nextInt());
		
		
	}

}
