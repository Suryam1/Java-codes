package collections.generics;

public class Box2<T> {

	private T object;
	
	public Box2() {
		// TODO Auto-generated constructor stub
	}
	
	public void set(T object) {
		this.object=object;
	}
	
	public T get() {
		return object;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box2<String> object = new Box2<>();
		
		object.set(new String("Candy"));
		System.out.println(object.get());
		
		object.set(new String("Pizza"));
		System.out.println(object.get());
		
		Box2<Double> dObject = new Box2<Double>();
		dObject.set(new Double(100.90));
		System.out.println(dObject.get());
	}

}
