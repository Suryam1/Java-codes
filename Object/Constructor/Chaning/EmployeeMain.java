package Object.Constructor.Chaning;

public class EmployeeMain {

	public EmployeeMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Employee obj1=new Employee("Rishabh","Aggarwal" ,25 );
		Employee obj2=new Employee("Suryam", "D", "Bhukania", 21);
		obj1.getDetails();
		obj2.getDetails();
	}

}
