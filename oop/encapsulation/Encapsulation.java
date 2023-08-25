package oop.encapsulation;


/*
 * Class : Basic Static Structure - Fields & Methords
 * 
 * Object; Real World Entity
 * 
 * Encapsulation: To wrap the fields and methords
 * 
 */

public class Encapsulation {
	
	
	int serialNo;
	//No Argumented Constructor - Default Constructor - Its not required
	/*public Encapsulation() {
		serialNo=10;
		//System.out.println("Serail No. : "+ serialNo);//10
		//System.out.println("Serail No. : "+ ++serialNo);// 10 to 11
		
		//System.out.println("Serail No. : "+ (1+serialNo));//12
		//System.out.println("Serail No. : "+ (serialNo+1));//12
	}*/
	
	public Encapsulation(int serialNo) {
		
	}

	
	public void Methord() {
		System.out.println("Serail No. : "+ serialNo);
	}
	
	
	//Setters and Getters
	public int getSerialNo() {
		return serialNo;
	}


	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	
	
	
	/*public static void main(String[] args) {
		
		Encapsulation obj=new Encapsulation();
		
		// An object is a real time entity to access everything from the class
		obj.setSerialNo(25);
		
		System.out.println(obj.getSerialNo());
		
		obj.Methord();
	}*/


}
