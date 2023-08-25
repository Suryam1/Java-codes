package arrays;
import java.util.Scanner;
public class ArrayOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		String[] employeeRequiredInfo={"ID","NAME","DESIGNATION","TEAM","PROJECT","LOCATION"};
		String employeeData;
		String[] employeeInfo=new String[6];
		int n;
//		System.out.print("Enter the number of employees : ");
//		n=input.nextInt();
		n=2;
//		System.out.println();
		String[] employeeCompleteInfo=new String[n];
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<employeeRequiredInfo.length;j++) {
				System.out.print(employeeRequiredInfo[j]+" : ");
				employeeInfo[j]=input.nextLine();
			}
			
			employeeData="";
			
			for(int j=0;j<employeeInfo.length;j++) {
				employeeData=employeeData+employeeRequiredInfo[j]+ " : "+employeeInfo[j]+"\n";
			}
			
			employeeCompleteInfo[i]=employeeData;
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(employeeCompleteInfo[i]);
		}
	}

}
