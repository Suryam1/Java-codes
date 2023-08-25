package oop.encapsulation;

public class EncapsulationAccess {

	public EncapsulationAccess() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationExample2 obj=new EncapsulationExample2();
		obj.setCollegeCode("01");
		obj.setStudentName("Rishabh");
		obj.setStudentCode("1007");
		
		obj.getStudentDetails();
		
		EncapsulationExample2 obj2=new EncapsulationExample2();
		obj2.setCollegeCode("9876");
		obj2.setStudentName("Ashish");
		obj2.setStudentCode("0101");
		
		obj2.getStudentDetails();
		System.out.println("--------------------------");
		
		EncapsulationExample2 obj3;
		obj3=obj2;
		obj3.setCollegeCode("1000");
		
		obj3.getStudentDetails();
		System.out.println("---------------------------");
		obj2.getStudentDetails();
	}

}
