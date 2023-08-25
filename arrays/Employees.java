package arrays;
import java.util.Scanner;
public class Employees {

	private String[] id= {"ID","NAME","DESIGNATION","TEAM NAME","PROJECT NAME","COUNTRY"};
	private String[] data=new String[6];
	
	public void getEmployData(int x) {
		System.out.println("Informations of "+(x+1)+" employee.");
		for(int i=0;i<data.length;i++) {
			System.out.println(id[i]+" : "+data[i]);
		}
		System.out.println();
	}
	
	public Employees(int x) {
		System.out.println("Enter the "+(x+1)+" employee information");
		Scanner input=new Scanner(System.in);
		
		
		for(int i=0;i<data.length;i++) {
			System.out.print("Enter your "+id[i]+" : ");
			data[i]=input.nextLine();
		}
		System.out.println();
		
	}

}
