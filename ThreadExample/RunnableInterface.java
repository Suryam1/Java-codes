package ThreadExample;

public class RunnableInterface extends Thread implements Runnable{

	public RunnableInterface() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Inside: "+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside: "+Thread.currentThread().getName());
		
		Thread objThread = new RunnableInterface();
		
		
//		RunnableInterface obj=new RunnableInterface();
//		Thread objThread=new Thread(obj);
		
		
		objThread.start();
		
		System.out.println("Main Thread is Running......");
	}

	

}
