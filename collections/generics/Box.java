package collections.generics;

public class Box {

	private Object object;
	
	public Box() {
		// TODO Auto-generated constructor stub
	}
	
	public void set(Object object) {
		this.object=object;
	}
	
	public Object get() {
		return object;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box obj = new Box();
		
		obj.set(new String("Hello"));
		System.out.println(obj.get());
		
		obj.set(new Double(10.00));
		System.out.println(obj.get());
	}

}
