package ThreadExample;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable runnable = new ThreadLifeCycleState();
		
		Thread c = new Thread(runnable);
		
		System.out.println(c.getState());//NEW
		
		c.start();
		
		System.out.println(c.getState());//RUNNABLE
	}

}
