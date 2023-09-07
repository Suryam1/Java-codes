package collections.generics;

public class Box4<T extends Number> {

	private T[] boxData;
	
	public Box4() {
		// TODO Auto-generated constructor stub
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

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Double[] item_price = {500.00,250.00,50.00,100.00,200.0};
		Box4<Double> sobject2 = new Box4<>();
		sobject2.showBoxDat(item_price);
		*/
		
		Double[] item_price_double = {500.00,250.00,50.00,100.00,200.0};
		Integer[] item_price_int= {500,250,50,100,200};
		Box4<Double> sobject2 = new Box4<>();
		sobject2.showBoxDat(item_price_double);
		sobject2.showBoxDat(item_price_int);
	}

}
