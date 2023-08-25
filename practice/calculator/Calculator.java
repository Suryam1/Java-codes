package practice.calculator;
import java.util.Scanner;

public class Calculator {

	private int firstNumber;
	private int secondNumber;
	private String operation;
	
	//Calculator Constructor
	public Calculator() {
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the first number : ");
		
		firstNumber=input.nextInt();
		
		System.out.print("Enter the operation you need to perform : ");
		
		operation=input.next();
		
		System.out.print("Enter the second number : ");
		
		secondNumber=input.nextInt();
		
		input.close();
	}
	
	//Addition of two Numbers
	private int addition() {
		return firstNumber+secondNumber;
	}
	
	//Difference of two Numbers
	private int difference() {
		return firstNumber-secondNumber;
	}
	
	//Product of two Numbers
	private int product() {
		return firstNumber*secondNumber;
	}
	
	//Division of two Numbers
	private int division() {
		return firstNumber/secondNumber;
	}
	
	//Remainder of two Numbers
	private int remainder() {
		return firstNumber%secondNumber;
	}
	
	//Power of a number
	private int power() {
		int result=1;
		for (int i=1;i<=secondNumber;i++) {
			result*=firstNumber;
		}
		return result;
	}
	
	
	private String getOperation() {
		return operation;
	}
	
	public void computeResult() {
		
		//Switch Case Implementation
		
		switch (getOperation()) {
			case "+":
				System.out.println("Result of "+firstNumber+ " + "+secondNumber+" is "+addition());
				break;
			case "-":
				System.out.println("Result of "+firstNumber+ " - "+secondNumber+" is "+difference());
				break;
			case "*":
				System.out.println("Result of "+firstNumber+ " * "+secondNumber+" is "+product());
				break;
			case "/":
				System.out.println("Result of "+firstNumber+ " / "+secondNumber+" is "+division());
				break;
			case "%":
				System.out.println("Result of "+firstNumber+ " % "+secondNumber+" is "+remainder());
				break;
			case "^":
				System.out.println("Result of "+firstNumber+ " ^ "+secondNumber+" is "+power());
				break;
			default:
				System.out.println("Invalid Operation");
				break;
		}
		
	}

}
