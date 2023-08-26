package ThreadExample;


public class RaceRun extends Thread{

	private int count=3;
	public RaceRun() {
		// TODO Auto-generated constructor stub
		System.out.println("Welcome to Grand Race Finals!!!!!");
	}
	
	public void startCount() throws InterruptedException {
		while(count>=0){
			if(count==0) {
				System.out.println("Go!!!!");
				break;
			}
			System.out.println(count);
			sleep((long)(1000));
			count--;
		}
	}

	public static void main(String[] args) {
		
		RaceRun obj = new RaceRun();
		try {
			obj.startCount();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new Car("HONDA").start();
		new Car("MITSUBISHI").start();
		new Car("YAHAMA").start();
	}

}
