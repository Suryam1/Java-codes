package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example08 {

	public Example08() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Pattern pattern = Pattern.compile("Flight No.: 1024");

		//Pattern pattern = Pattern.compile("Flight No.: \\d\\d\\d\\d");
		
		//Pattern pattern = Pattern.compile("Flight No.: \\d{5}"); //false
		//Pattern pattern = Pattern.compile("Flight No.: \\d{4}"); 	//true
		//Pattern pattern = Pattern.compile("Flight No.: \\d{4,}"); 
		//Pattern pattern = Pattern.compile("Flight No.: \\d{2,5}"); 

		//Pattern pattern = Pattern.compile("^Flight No.: \\d{3,}$"); 

		//Pattern pattern = Pattern.compile("^.light No.: \\d{3,}$"); 
		
		//Pattern pattern = Pattern.compile("^[f|F]light No.: \\d{3,}$"); 

		//Pattern pattern = Pattern.compile("^[f|F|AF]light No.: \\d{3,}$"); 

		Pattern pattern = Pattern.compile("^(f|F|AF)light No.: \\d{3,}$"); 

		Matcher matcher = pattern.matcher("Flight No.: 1024");
		
		boolean matchFound = matcher.find();
		
		System.out.println(matchFound);
		
	}

}
