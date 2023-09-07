package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example05 {

	public Example05() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile("University",Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("Chitkara UniVeRsIty Chitkara University University Chitkara University Universsty");
		
		boolean matchFound = matcher.find();
		while(matchFound) {
			if(matchFound) {
				System.out.println("Match found from "+matcher.start()+" and end at "+(matcher.end()-1)+".");
			}
			else {
				System.out.println("Match not Found");
			}
			matchFound=matcher.find();
		}
	}

}
