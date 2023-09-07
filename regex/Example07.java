package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example07 {

	public Example07() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regex="Python";
		String sentence = "Python Regular Expression Python";
		String replace="Java";
		
		System.out.println("Before Replacing : "+sentence);
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(sentence);
		
		
		sentence=matcher.replaceAll(replace);
		//sentence = matcher.replaceFirst(replace);
		
		
		System.out.println("After Replacing : "+sentence);
	}

}
