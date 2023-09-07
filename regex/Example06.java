package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example06 {

	public Example06() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern pattern  = Pattern.compile("Ja+",Pattern.CASE_INSENSITIVE);		//Give words start with ja
		
		Matcher matcher = pattern.matcher("Java is a technology and a platform. - javaTrainer");
		
		while(matcher.find()) {
			System.out.println("Pattern found from "+ matcher.start()+ " to "+(matcher.end()-1)+".");
		}
		
	}

}
