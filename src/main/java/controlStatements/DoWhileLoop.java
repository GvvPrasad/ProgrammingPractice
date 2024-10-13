package controlStatements;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int number = userInput.nextInt();
		
		do {
			System.out.println(number);
			number++;
		} while (number<10);

	}

}
