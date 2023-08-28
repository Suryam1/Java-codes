package threads.interference.examples0;

public class SharedCounter {
	
	static int counter=5;
	
	//incrementing the  value
	//public void increaseByOne() {
	public synchronized void increaseByOne() {
		for(int i=0;i<10;i++) {
			System.out.println("After Increment : "+ ++counter);
		}
	}
	
	
	//Decreasing the  value
	//public void decreaseByOne() {
	public synchronized void decreaseByOne() {
			for(int i=0;i<10;i++) {
				System.out.println("After Decrement : "+ --counter);
			}
	}
	
	public int getCounter() {
		return counter;
	}

}
