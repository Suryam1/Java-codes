package practice.marker_interface_example;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CRUD obj = new CRUD();
		
		System.out.println("Employee Added : "+obj.addEmployees("10100DEV", "PHILIP"));
		System.out.println("------------------------------------");
		
		System.out.println("Employee Data : "+obj.showEmployees());
		System.out.println("------------------------------------");
		
		System.out.println("Employee Deleted : "+obj.deleteEmployee("10100DEV"));
		System.out.println("------------------------------------");
		
		System.out.println("Employee Added : "+obj.addEmployees("10101DEV", "Richard"));
		System.out.println("------------------------------------");
		
		System.out.println("Employee Data : "+obj.showEmployees());
		System.out.println("------------------------------------");
		
		System.out.println("Employee Updated : "+obj.updateEmployee("11000DEV", "Tom"));		
		System.out.println("------------------------------------");
		
		System.out.println("Employee Data : "+obj.showEmployees());
		System.out.println("------------------------------------");
	}

}
