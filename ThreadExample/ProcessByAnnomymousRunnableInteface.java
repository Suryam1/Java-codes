package ThreadExample;

public class ProcessByAnnomymousRunnableInteface {

	public ProcessByAnnomymousRunnableInteface() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside: "+Thread.currentThread().getName());
		
		System.out.println("Creating Runnable...");
		
		Runnable runnable=new Runnable() {
			
			@Override																		//Annomymous Class
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Inside: "+Thread.currentThread().getName());
			}
		};
		
		System.out.println("Creating Thread...");
		Thread thread = new Thread(runnable);
		
		System.out.println("Starting Thread...");
		thread.start();
		
		System.out.println("Main thread is running...");
	}

}
