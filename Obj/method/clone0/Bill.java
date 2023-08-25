package Obj.method.clone0;

public class Bill {
	private String month;
	private double rent;
	private double water;
	private double mobile;
	private double internet;
	private double electricity;
	
	private double[] bill;
	
	public Bill(String month,double[] bill) {
		
		this.month=month;
		
		//Shallow Copy Changes made in object reflect in copy object also
		
		//this.bill=bill;
		
		//Deep Copy Changes made in object don't reflect in copy object
		this.bill=new double[bill.length];
		for(int i=0;i<bill.length;i++) {
			this.bill[i]=bill[i];
		}
	
	}
	
	public void monthlyBill() {
		System.out.println(month);
		System.out.println("Rent : "+bill[0]);
		System.out.println("Water : "+bill[1]);
		System.out.println("Mobile : "+bill[2]);
		System.out.println("Internet : "+bill[3]);
		System.out.println("Electricity : "+bill[4]);
	}
}
