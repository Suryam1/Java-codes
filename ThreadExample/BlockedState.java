package ThreadExample;

class DemoBlockRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		commonResource();
	}
	
	private static synchronized void commonResource() {
		while(true) {
			//System.out.println(Thread.currentThread().getName());
		}
	}
}


public class BlockedState {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new DemoBlockRunnable());
		Thread t2 = new Thread(new DemoBlockRunnable());
		
		t1.start();
		t2.start();
		
		Thread.sleep(1000);
		
		System.out.println(t1.getState());
		System.out.println(t2.getState());
		
		System.exit(0);
	}

}
