package wrapperClass;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		int j=20;
	
		System.out.println("Sum : "+i+j);
		System.out.println("Sum : "+(i+j));
		
		Integer j1=10;
		Integer j2=20;
		System.out.println("Sum : "+j1+j2);
		System.out.println("Sum : "+(j1+j2));
		
		System.out.println("Sum : "+(i+j1));
		
		
		//These are depreciated so we don't use them
		Integer obj1=new Integer(10);
		Integer obj2=new Integer(20);
		
		System.out.println("Sum : "+obj1+obj2);
		System.out.println("Sum : "+(obj1+obj2));
		
		
		//We use factory methods in place of it
		Integer obj4=Integer.valueOf(10);
		Integer obj5=Integer.valueOf(20);
		
		System.out.println("Sum : "+obj4+obj5);
		System.out.println("Sum : "+(obj4+obj5));
	
	}

}
