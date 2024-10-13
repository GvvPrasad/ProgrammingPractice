package controlStatements;
import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int maxNumber = userInput.nextInt();
		int tableNumber = userInput.nextInt();
		
		for (int i = 1; i <= maxNumber; i++) {
			int num = i*tableNumber;
			System.out.println(i +" * "+tableNumber +" = "+num);
		}

	}

}
