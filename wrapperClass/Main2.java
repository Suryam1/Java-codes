package wrapperClass;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Convert Primitive to Wrapper
		int i=10;
		Integer obj=Integer.valueOf(i);
		System.out.println(obj);
		
		//Convert wrapper to Primitive
		Integer obj2=20;
		int j=obj2.intValue();
		System.out.println(j);
		
		
		//Integer value =25  is equivalent of Integer value=Integer.valueOf(25)
	}

}
