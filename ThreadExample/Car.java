package ThreadExample;

public class Car extends Thread {
	
	public static int count=1;
	
	public Car(String name) {
		super(name);
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(getName()+" Cleared Lap "+i);
			try {
				sleep((long)(Math.random()*1000));
			}catch (InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println(getName()+" Cleared Lap "+10);
		System.out.println(getName()+" got the "+count+" position");
		count++;
	}
	
}

