package decisionStatements;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		String browserName = userInput.nextLine();
		browsers(browserName);
	}

	public static void browsers(String browserName) {

		switch (browserName) {
		case "Chrome":
			System.out.println("This is chrome browser");
			break;
		case "Edge":
			System.out.println("This is Edge browser");
			break;
		case "Firefox":
			System.out.println("This is Firefox browser");
			break;
		case "Safari":
			System.out.println("This is Safari browser");
			break;
		default:
			System.out.println("Not a browser");
			break;
		}

	}

}
