package collections.generics;

public class Box3<T> {

	private T[] boxData;
	
	public Box3(T[] boxData) {
		// TODO Auto-generated constructor stub
		this.boxData=boxData;
	}
	
	public T[] getBoxData() {
		return boxData;
	}
	public <T> void showBoxDat(T[] boxData) {
		for(T data:boxData) {
			System.out.print(data+" ");
		}
		System.out.println();
	}

	public <T> void inspect() {
		System.out.println("T: "+boxData.getClass().getSimpleName());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] item_name= {"Pizza","Burger","Coke","Fries","Wrap"};
		
		Box3<String> sobject = new Box3<>(item_name);
		sobject.showBoxDat(sobject.getBoxData());
		sobject.inspect();
		
		
		Double[] item_price = {500.00,250.00,50.00,100.00,200.0};
		Box3<Double> sobject2 = new Box3<>(item_price);
		sobject2.showBoxDat(sobject2.getBoxData());
		sobject2.inspect();
	}

}
