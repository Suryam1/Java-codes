package Obj.method.clone;

import Obj.method.clone0.Bill;

public class Pay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String month="January";
		double[] bill= {10000.00,100.00,500.00,1000.00,2500.00};
		bill[4]=4500.00;
		Bill obj=new Bill(month,bill);
		obj.monthlyBill();
		bill[4]=6500.00;
		obj.monthlyBill();
	}

}
