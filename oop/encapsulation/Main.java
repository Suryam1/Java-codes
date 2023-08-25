package oop.encapsulation;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int serialNo=100;
		Encapsulation obj=new Encapsulation(serialNo);
		
		// An object is a real time entity to access everything from the class
		obj.setSerialNo(25);
		
		System.out.println(obj.getSerialNo());
		
		obj.Methord();
	}

}
