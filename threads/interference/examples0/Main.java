package threads.interference.examples0;

public class Main{

	public static void main(String[] args) {
		final SharedCounter obj = new SharedCounter();
		
		Thread T1 = new Thread() {
									@Override
									public void run() {
										obj.increaseByOne();
									}
								};
								
								
							
		Thread T2 = new Thread() {
									@Override
									public void run() {
										obj.decreaseByOne();
									}
								};
								
		T1.start();
		T2.start();
	}
	
	
}
