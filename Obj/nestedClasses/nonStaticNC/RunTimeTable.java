package Obj.nestedClasses.nonStaticNC;

import java.util.Scanner;

public class RunTimeTable {

	private boolean temp;
	
	public RunTimeTable() {
		// TODO Auto-generated constructor stub
	}

	public void runTimeTable() {
			
			Scanner input=new Scanner(System.in);
			TimeTable obj=new TimeTable();
			
			System.out.println("Enter the operation you need to perform : \n1. Set Morning Schedule\n2. Set Afternoon Schedule\n3. Set Evening Schedule\n4. Show Morning Schedule\n5. Show Afternoon Schedule\n6. Show Evening Schedule\n7. Exit Program\n");
			String choice=input.nextLine();
			while(!(choice.equals("7"))) {
				
				if(choice.equals("1")) {
					System.out.print("Enter the start time of Morning Routine : ");
					obj.setStartTimeM(input.nextLine());
					
					System.out.print("Enter the end time of Morning Routine : ");
					obj.setEndTimeM(input.nextLine());
					
					System.out.print("Enter the number of activities you need to perform during morning(Max Activites can only be 10) : ");
					temp=obj.setNumberOfActivitiesM(input.nextLine());
					if(temp) {
						
						obj.setMorningActivities();
					}
					else {
						System.out.println("You can Only enter maximum 10 Activities");
					}
					
				}
				
				else if(choice.equals("2")) {
					System.out.print("Enter the start time of Afternoon Routine : ");
					obj.setStartTimeA(input.nextLine());
					
					System.out.print("Enter the end time of Afternoon Routine : ");
					obj.setEndTimeA(input.nextLine());
					
					System.out.print("Enter the number of activities you need to perform during morning(Max Activites can only be 10) : ");
					temp=obj.setNumberOfActivitiesA(input.nextLine());
					if(temp) {
						obj.setAfternoonActivities();
					}
					else {
						System.out.println("You can Only enter maximum 10 Activities");
					}
					
				}
				
				else if(choice.equals("3")) {
					System.out.print("Enter the start time of Evening Routine : ");
					obj.setStartTimeE(input.nextLine());
					
					System.out.print("Enter the end time of Evening Routine : ");
					obj.setEndTimeE(input.nextLine());
					
					System.out.print("Enter the number of activities you need to perform during morning(Max Activites can only be 10) : ");
					temp=obj.setNumberOfActivitiesE(input.nextLine());
					if(temp) {
						obj.setAfternoonActivities();						
					}
					else {
						System.out.println("You can Only enter maximum 10 Activities");
					}
					
				}
				
				else if(choice.equals("4")) {
					obj.morningTimeTable();
				}
				
				else if(choice.equals("5")) {
					obj.afternoonTimeTable();
				}
				
				else if(choice.equals("6")) {
					obj.eveningTimeTable();
				}
				
				System.out.println("Enter the operation you need to perform : \n1. Set Morning Schedule\n2. Set Afternoon Schedule\n3. Set Evening Schedule\n4. Show Morning Schedule\n5. Show Afternoon Schedule\n6. Show Evening Schedule\n7. Exit Program");
				choice=input.nextLine();
			}
			
	}
	
}
