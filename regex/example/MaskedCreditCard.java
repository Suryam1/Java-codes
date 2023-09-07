package regex.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MaskedCreditCard {

	public MaskedCreditCard() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String carNumber = "1234-2222-3333-0911";
		
		Pattern pattern = Pattern.compile("\\d{4}-\\d{4}-\\d{4}-");
		Matcher matcher = pattern.matcher(carNumber);
		
		String maskedCardNumber = matcher.replaceAll("XXXX-XXXX-XXXX-");
		
		System.out.println(maskedCardNumber);
		
	}

}
