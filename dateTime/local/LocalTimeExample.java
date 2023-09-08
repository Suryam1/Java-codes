package dateTime.local;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeExample {
	
	private LocalTime time;

	public LocalTimeExample() {
		// TODO Auto-generated constructor stub
		System.out.println("LocalTime");
		time=LocalTime.now();
	}

	public void showCurrentTime() {
		System.out.println("Time: "+time);
	}
	
	public void showCurrentHour() {
		System.out.println("Hour: "+time.getHour());
	}
	
	public void showCurrentMinutes() {
		System.out.println("Minute: "+time.getMinute());
	}
	
	public void showCurrentSecond() {
		System.out.println("Second: "+time.getSecond());
	}
	
	public void showCurrentNanao() {
		System.out.println("Nanos: "+time.getNano());
	}
	
	public void showNegativeCounterInHour() {
		System.out.println("-- COUNTDOWN: "+time.minusHours(24));
	}
	
	public void showPositiveCounterInHour() {
		System.out.println("++ COUNTDOWN: "+time.plusHours(24));
	}
	
	public void showTimeWith_AM_PM() {
		//12 Hour Clock
		System.out.println(DateTimeFormatter.ofPattern("hh:mm").format(LocalTime.now()));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTimeExample obj = new LocalTimeExample();
		
		obj.showCurrentTime();
		obj.showCurrentHour();
		obj.showCurrentMinutes();
		obj.showCurrentSecond();
		obj.showCurrentNanao();
		obj.showNegativeCounterInHour();
		obj.showPositiveCounterInHour();
	}

}
