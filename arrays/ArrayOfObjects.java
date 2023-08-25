package arrays;
import java.util.Scanner;

public class ArrayOfObjects {

	public ArrayOfObjects() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n;
		System.out.print("Enter the number of Employees : ");
		n=input.nextInt();
		
		Employees[] employData=new Employees[n];
		
		for(int i=0;i<employData.length;i++) {
			Employees obj=new Employees(i);
			employData[i]=obj;
		}
		
		for(int i=0;i<employData.length;i++) {
			employData[i].getEmployData(i);
		}
		
	}

}
