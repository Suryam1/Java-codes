package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example03 {

	public Example03() {
		// TODO Auto-generated constructor stub
	}
	
	public int runTest(String regex,String text) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		
		int matches=0;
		while(matcher.find()) {
			matches++;
		}
		return matches;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example03 obj =new Example03();
		int matches = obj.runTest(".","B.Tech");			//. means it shouldn't be null
		System.out.println(matches);
	}

}
