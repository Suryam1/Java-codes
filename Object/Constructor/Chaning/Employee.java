package Object.Constructor.Chaning;

public class Employee {
	
	private final String firstName;
	private final String middleName;
	private final String lastName;
	private final int age;
	
	public Employee(String firstName,String middleName,String lastName,int age) {
		// TODO Auto-generated constructor stub
		this.firstName=firstName;
		this.middleName=middleName;
		this.lastName=lastName;
		this.age=age;
	}
	
	public Employee(String firstName,String lastName,int age) {
		this(firstName,null,lastName,age);
	}
	
	public void getDetails() {
		System.out.println("Employee name : "+firstName+middleName+lastName);
		System.out.println("Age : "+age);
	}


}
