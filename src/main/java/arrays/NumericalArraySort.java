
package arrays;

import java.util.Arrays;
import java.util.Collections;

public class NumericalArraySort {

	public static void main(String[] args) {
		// Numerical array
		int[] numbers = { 10, 1, 5, 55, 77, 3 };
		Integer[] newNumbers = { 70, 1, 5, 44, 77, 6 };
		int[] loopNumber = { 3, 9, 2, 33, 7, 66 };

		// sort in ascending order using predefined function
		Arrays.sort(numbers);
		
		// sort in descending order using predefined function
		// java can not sort primitive data type in reverse order
		Arrays.sort(newNumbers, Collections.reverseOrder());

		// sort in ascending order without using predefined function
		for (int i = 0; i < loopNumber.length; i++) {
			for (int j = i + 1; j < loopNumber.length; j++) {
				int tmp = 0;
				if (loopNumber[i] > loopNumber[j]) {
					tmp = loopNumber[i];
					loopNumber[i] = loopNumber[j];
					loopNumber[j] = tmp;
				}
			}
			System.out.println(loopNumber[i]);
		}

		// sort in descending order without using predefined function
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				int tmp = 0;
				if (numbers[i] < numbers[j]) {
					tmp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = tmp;
				}
			}
			System.out.println(numbers[i]);
		}


	}

}
