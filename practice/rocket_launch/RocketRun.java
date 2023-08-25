package practice.rocket_launch;

import java.util.Scanner;

public class RocketRun {
	private boolean ignitionStatus,oxygenStatus,networkStatus,powerStatus,engineStatus;

	public RocketRun() {
		// TODO Auto-generated constructor stub
	}
	
	public void runRocket() {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the  Ignition Status : ");
		ignitionStatus=input.nextBoolean();
		
		System.out.print("Enter the  Oxygen Status : ");
		oxygenStatus=input.nextBoolean();
		
		System.out.print("Enter the  Network Status : ");
		networkStatus=input.nextBoolean();
		
		System.out.print("Enter the  Power Status : ");
		powerStatus=input.nextBoolean();
		
		System.out.print("Enter the  Engine Status : ");
		engineStatus=input.nextBoolean();
		
		RocketLaunch obj=new RocketLaunch(ignitionStatus,oxygenStatus,networkStatus,powerStatus,engineStatus);
		
		obj.checkForLaunch();
	}

}
