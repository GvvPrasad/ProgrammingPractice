package arrays;

import java.util.Arrays;
import java.util.Collections;

public class StringArraySort {

	public static void main(String[] args) {

		String[] cars = { "prasad", "BMW", "Audio", "Lancer" };

		// sort in ascending order using predefined function
		Arrays.sort(cars);

		// sort in descending order using predefined function
		Arrays.sort(cars, Collections.reverseOrder());

		// sort in ascending order without using predefined function
		for (int i = 0; i < cars.length; i++) {
			for (int j = i + 1; j < cars.length; j++) {
				String tmp;
				if (cars[i].compareTo(cars[j]) > 0) {
					tmp = cars[i];
					cars[i] = cars[j];
					cars[j] = tmp;
				}
			}
			System.out.println("***"+cars[i]);
		}

		System.out.println();
		// sort in descending order without using predefined function
		for (int i = 0; i < cars.length; i++) {
			for (int j = i + 1; j < cars.length; j++) {
				String tmp;
				if (cars[i].compareTo(cars[j]) < 0) {
					tmp = cars[i];
					cars[i] = cars[j];
					cars[j] = tmp;
				}
			}
			System.out.println(cars[i]);
		}

	}

}
