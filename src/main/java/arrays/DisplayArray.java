
package arrays;

public class DisplayArray {
	public static void main(String[] args) {

		/*
		 int[] arr = {1, 2, 3, 4};
		 int[] arr = new int[5];
		 int[] arr = new int[] {1, 2, 3, 4};
		 */
		
		String[] cars = { "BMW", "Audio", "Fiat", "KIA" };

		// Length of array
		System.out.println("Array length is: " + cars.length);

		// print array using for loop
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}

		System.out.println();

		// print array using for-each
		for (String newCarsList : cars) {
			System.out.println(newCarsList);
		}

	}
}
