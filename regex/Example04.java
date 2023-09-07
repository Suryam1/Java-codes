package regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example04 {
	
	public Scanner input = new Scanner(System.in);
	
	public Example04() {
		// TODO Auto-generated constructor stub
	}

	public boolean runTest(String regex,String text) {
		
		text=input.next(); //Infosys//TCS
		
		Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(text);
		
		return matcher.find();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example04 obj =new Example04();
		String  regex = "INFOSYS";
		String text=null;
		
		boolean matches = obj.runTest(regex, text);
		
		System.out.println(matches);
	}

}
