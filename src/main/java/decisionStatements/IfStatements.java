package decisionStatements;

import java.util.Scanner;

public class IfStatements {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		int numberOne = userInput.nextInt();
		int numberTwo = userInput.nextInt();
		int numberThree = userInput.nextInt();
		
		if (numberOne > numberTwo && numberOne>numberThree) {
			System.out.println(numberOne + " : is the biggest");
		}else if (numberTwo>numberOne && numberTwo>numberThree) {
			System.out.println(numberTwo + " : is the biggest");
		}else {
			System.out.println(numberThree + " : is the biggest");
		}

	}

}
