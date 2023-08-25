package oop.inheritance.multiple;

public class Car extends Car1 implements CompanyInterface,ProductInterface{

	public Car() {
		// TODO Auto-generated constructor stub
		System.out.println("Car");
	}
	
	public void companyName() {
		System.out.println("HONDA");
	}
	
	public void carTypes() {
		System.out.println("ELEVATE - AMAZE");
	}
	public void productType() {
		System.out.println("SUV - SEDAN");
	}
}
