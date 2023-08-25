
public class HelloWorld {
	
	public HelloWorld() {
		System.out.println("Constructor");
	}
	
	//init block  just a block
	//This only runs as soon as we initailised an object
	{
		System.out.println("Just-A-Block");
	}
	//Static Blocks come first before any static methord
	static {
		System.out.println("Static-Block");
	}
	
	// Static Methord
	static void staticMethord() {
		System.out.println("Static-Methord");
	}
	
	public static void main(String[] args) {
		
		//String message="Hello World";
		
		//System.out.println(message);
		
		HelloWorld obj=new HelloWorld();
		
		System.out.println("Object : "+obj);
		
		//obj.staticMethord();
		HelloWorld.staticMethord();
	}

}
