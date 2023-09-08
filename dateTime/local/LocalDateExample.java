package dateTime.local;

import java.time.LocalDate;

public class LocalDateExample {

	private LocalDate date;
	
	public LocalDateExample() {
		// TODO Auto-generated constructor stub
		System.out.println("LocalDate");
		date=LocalDate.now();
	}
	
	public void showTodayDate() {
		System.out.println("Today: "+date);
	}
	
	public void showCurrentYear() {
		System.out.println("Today: "+date.getYear());
	}
	
	public void showCurrentMonth() {
		System.out.println("Today: "+date.getMonth());
	}
	
	public void showCurrentMonthValue() {
		System.out.println("Month: "+date.getMonthValue());
	}
	
	public void showWeekOfDay() {
		System.out.println("Today: "+date.getDayOfWeek());
	}
	
	public void showDayOfTheMonth() {
		System.out.println("Today: "+date.getDayOfMonth());
	}
	
	public void showDayOfTheYear() {
		System.out.println("Today: "+date.getDayOfYear());
	}
	
	public void showNextDate() {
		System.out.println("Next Date: "+date.plusDays(1));
	}
	
	public void showPreviousDate() {
		System.out.println("Previous Date: "+date.plusDays(-1));
	}
	
	public void showNextMonth() {
		System.out.println("Next Month: "+date.plusMonths(1));
	}
	
	public void showPreviousMonth() {
		System.out.println("Previous Month: "+date.plusDays(-1));
	}
	
	public void showNextWeek() {
		System.out.println("Next Week: "+date.plusWeeks(1));
	}
	
	public void showNextYear() {
		System.out.println("Next Year: "+date.plusYears(1));
	}
	
	public void showPreviousYear() {
		System.out.println("Previous Year: "+date.plusYears(-1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateExample obj = new LocalDateExample();
		
		obj.showTodayDate();
		obj.showCurrentYear();
		obj.showCurrentMonth();
		obj.showCurrentMonthValue();
		obj.showWeekOfDay();
		obj.showDayOfTheMonth();
		obj.showDayOfTheYear();
		obj.showNextDate();
		obj.showPreviousDate();
		obj.showNextMonth();
		obj.showPreviousMonth();
		obj.showNextWeek();
		obj.showNextYear();
		obj.showPreviousYear();
	}

}
