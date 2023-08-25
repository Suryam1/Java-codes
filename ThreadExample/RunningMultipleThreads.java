package ThreadExample;

public class RunningMultipleThreads extends Thread {

	public RunningMultipleThreads() {
		// TODO Auto-generated constructor stub
		System.out.println("Multiple Threads...");
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunningMultipleThreads obj = new RunningMultipleThreads();
		
		Thread objT1= new Thread(obj);
		Thread objT2= new Thread(obj);
		Thread objT3= new Thread(obj);
		
		objT1.start();
		objT2.start();
		objT3.start();
	}

}
