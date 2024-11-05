package variables;

import java.util.Scanner;

public class EVenOrOdd {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		int number = userInput.nextInt();
		
		if (number%2==0) {
			System.out.println("Given number is Even");
		}else {
			System.out.println("Given number is Odd");
		}


	}

}
