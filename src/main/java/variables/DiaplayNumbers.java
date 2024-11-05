package variables;

import java.util.Scanner;

public class DiaplayNumbers {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int tillNumber = userInput.nextInt();
		
		for (int i = 1; i <= tillNumber; i++) {
			System.out.println(i);
		}

	}

}
