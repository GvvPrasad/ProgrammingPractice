package controlStatements;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int number = userInput.nextInt();
		
		while (number<10) {
			System.out.println(number);
			number++;
		}
	}

}
