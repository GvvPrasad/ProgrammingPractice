package variables;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// check given year is Leap year or not

		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter year: ");
		int year = userInput.nextInt();

		if (year % 4 == 0 || (year % 100 == 0) && (year % 400 == 0)) {
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is not a leap year");
		}

	}

}
