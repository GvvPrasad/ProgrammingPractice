package variables;

import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		// Convert a given number(Seconds) into minutes, hours.
		
		Scanner UserInput = new Scanner(System.in);
		System.out.print("Enter Seconds: ");
		int Seconds = UserInput.nextInt();
		
		double Minutes = Seconds/60;
		double Hours = Minutes/60;
		
		System.out.println("The no of Minutes: " +Minutes);
		System.out.println("The no of Hours: " +Hours);

	}

}
