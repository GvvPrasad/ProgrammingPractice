package variables;

import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		// Convert a given number(Seconds) into minutes, hours.
		
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter Seconds: ");
		int seconds = userInput.nextInt();
		
		double minutes = seconds/60;
		double hours = minutes/60;
		
		System.out.println("The no of Minutes: " +minutes);
		System.out.println("The no of Hours: " +hours);

	}

}
