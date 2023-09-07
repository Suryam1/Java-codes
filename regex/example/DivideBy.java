package regex.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DivideBy {

	public DivideBy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern pattern = Pattern.compile("^(\\d+) divided by (\\d+)$");
		
		Matcher matcher = pattern.matcher("10 divided by 2");
		
		if(matcher.find()) {
			String statement = "Result: "+matcher.replaceFirst("$1/$2");
			System.out.println(statement);
			
			int result = Integer.valueOf(matcher.group(1)) / Integer.valueOf(matcher.group(2));
			System.out.println("Result : "+result);
		}
		
	}

}
