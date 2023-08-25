package enumerator;


enum WeekDays{
	MONDAY,TUESDAY,WEDNESDAY,THRUSDAY,FRIDAY,SATURDAY,SUNDAY
}


public class Main {
	
	

	
	
	public Main() {
		// TODO Auto-generated constructor stub
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main obj =new Main();
		WeekDays today=WeekDays.TUESDAY;
		System.out.println("Today : "+today);
		System.out.println("Length : "+WeekDays.values().length);
	}

}
