package Obj.nestedClasses.nonStaticNC;

import java.util.Scanner;

public class TimeTable {
	Scanner input=new Scanner(System.in);
	private final static int MAX_ACTIVITIES=10;

	
	//Fields for Morning Routine
	private String startTimeM;
	private String endTimeM;
	private String numberOfActivitiesM;
	private int tempM=0;
	private static String[] morningActivities=new String[MAX_ACTIVITIES];
	
	
	//Fields for Afternoon Routine
	private String startTimeA;
	private String endTimeA;
	private String numberOfActivitiesA;
	private int tempA=0;
	private static String[] afternoonActivities=new String[MAX_ACTIVITIES];
	
	
	//Fields for Evening Routine
	private String startTimeE;
	private String endTimeE;
	private String numberOfActivitiesE;
	private int tempE=0;
	private static String[] eveningActivities=new String[MAX_ACTIVITIES];
	
	
	//Methods for Morning Routine
	public TimeTable() {
		// TODO Auto-generated constructor stub
	}
	
	public void setStartTimeM(String startTimeM) {
		this.startTimeM=startTimeM;
	}
	
	public void setEndTimeM(String endTimeM) {
		this.endTimeM=endTimeM;
	}
	
	public boolean setNumberOfActivitiesM(String numberOfActivitiesM) {
		this.numberOfActivitiesM=numberOfActivitiesM;
		this.tempM=Integer.parseInt(numberOfActivitiesM);
		if(tempM<=10) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void setMorningActivities() {
		for(int i=0;i<tempM;i++) {
			System.out.print("Enter the "+(i+1)+" Activities : ");
			morningActivities[i]=input.nextLine();
		}
		System.out.println("All Activities are set.");
	}
	
	
	//Method for Afternoon Routine
	public void setStartTimeA(String startTimeA) {
		this.startTimeA=startTimeA;
	}
	
	public void setEndTimeA(String endTimeA) {
		this.endTimeA=endTimeA;
	}
	
	public boolean setNumberOfActivitiesA(String numberOfActivitiesA) {
		this.numberOfActivitiesA=numberOfActivitiesA;
		this.tempA=Integer.parseInt(numberOfActivitiesA);
		if(tempA<=10) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void setEveningActivities() {
		for(int i=0;i<tempA;i++) {
			System.out.print("Enter the "+(i+1)+" Activities : ");
			afternoonActivities[i]=input.nextLine();
		}
		System.out.println("All Activities are set.");
	}
	
	
	//Method for Evening Routine
	public void setStartTimeE(String startTimeE) {
		this.startTimeE=startTimeE;
	}
	
	public void setEndTimeE(String endTimeE) {
		this.endTimeE=endTimeE;
	}
	
	public boolean setNumberOfActivitiesE(String numberOfActivitiesE) {
		this.numberOfActivitiesE=numberOfActivitiesE;
		this.tempE=Integer.parseInt(numberOfActivitiesE);
		if(tempE<=10) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void setAfternoonActivities() {
		for(int i=0;i<tempE;i++) {
			System.out.print("Enter the "+(i+1)+" Activities : ");
			eveningActivities[i]=input.nextLine();
		}
		System.out.println("All Activities are set.");
	}

	
	//Get Morning TimeTable
	public void morningTimeTable() {
		
		class Morning{
			
			public void wakeUp() {
				System.out.println("Morining Routine is from "+startTimeM+" to "+endTimeM);
			}
			
			public void getActivities() {
				for(int i=0;i<tempM;i++) {
					System.out.println(morningActivities[i]);
				}
				System.out.println();
			}
		}
		Morning objM=new Morning();
		if(tempM>0) {
			objM.wakeUp();
			objM.getActivities();			
		}
		else {
			System.out.println("Kindly Enter the Activities First!!!!");
		}
	}
	
	
	//Get Afternoon TimeTable
	public void afternoonTimeTable() {
			
			class Afternoon{
				
				public void wakeUp() {
					System.out.println("Afternoon Routine is from "+startTimeA+" to "+endTimeA);
				}
				
				public void getActivities() {
					for(int i=0;i<tempA;i++) {
						System.out.println(afternoonActivities[i]);
					}
					System.out.println();
				}
			}
			Afternoon objM=new Afternoon();
			if(tempA>0) {
				objM.wakeUp();
				objM.getActivities();			
			}
			else {
				System.out.println("Kindly Enter the Activities First!!!!");
			}
	}
	
	
	//Get Evening TimeTable
	public void eveningTimeTable() {
		
		class Evening{
			
			public void wakeUp() {
				System.out.println("Evening Routine is from "+startTimeE+" to "+endTimeE);
			}
			
			public void getActivities() {
				for(int i=0;i<tempE;i++) {
					System.out.println(eveningActivities[i]);
				}
				System.out.println();
			}
		}
		Evening objM=new Evening();
		if(tempE>0) {
			objM.wakeUp();
			objM.getActivities();			
		}
		else {
			System.out.println("Kindly Enter the Activities First!!!!");
		}
	}

}
