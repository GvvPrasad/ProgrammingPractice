package variables;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int numberOne = userInput.nextInt();
		int numberTwo = userInput.nextInt();
		int numberThree = userInput.nextInt();

		if (numberOne > numberTwo && numberOne > numberThree) {
			System.out.println(numberOne + " :is the gratest number");
		} else if (numberTwo > numberOne && numberTwo > numberThree) {
			System.out.println(numberTwo + " :is the gratest number");
		} else {
			System.out.println(numberThree + " :is the gratest number");
		}
	}

}
