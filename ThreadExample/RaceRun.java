package ThreadExample;


public class RaceRun{

	public RaceRun() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		new Car("HONDA").start();
		new Car("MITSUBISHI").start();
		new Car("YAHAMA").start();
	}

}
