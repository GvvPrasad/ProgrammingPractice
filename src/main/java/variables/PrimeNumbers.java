package variables;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int finalNumber = userInput.nextInt();

		for (int i = 2; i <= finalNumber; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}

			}
			if (isPrime) {
				System.out.print(i + " ");
			}
		}

	}

}
