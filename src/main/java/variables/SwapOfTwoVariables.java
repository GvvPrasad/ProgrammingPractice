package variables;

import java.util.Scanner;

public class SwapOfTwoVariables {

	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		// Swapping number without using a third variable
		//swapNumber();
		
		// Swapping Strings without using a third variable
		swapStrings();
	}

	
	public static void swapNumber() {
		int numberOne = userInput.nextInt();
		int numberTwo = userInput.nextInt();
		
		numberOne = numberOne + numberTwo;
		numberTwo = numberOne - numberTwo;
		numberOne = numberOne - numberTwo;
		
		System.out.println("1st number: " + numberOne);
		System.out.println("2nd number: " + numberTwo);
	}

	public static void swapStrings() {
		String stringOne = userInput.next();
		String stringTwo = userInput.next();
		
		stringOne = stringOne + stringTwo;
		stringTwo = stringOne.substring(0,(stringOne.length()-stringTwo.length()));
		stringOne = stringOne.substring(stringTwo.length());
		
		System.out.println(stringOne +" "+ stringTwo);
		
	}
}
