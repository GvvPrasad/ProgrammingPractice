package arrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

	public static void main(String[] args) {
		/*
		 * ArrayList<String> list = new ArrayList<>(); ArrayList<String> list = new
		 * ArrayList<>(Arrays.asList("A", "B", "C")); From Collection List<String>
		 * anotherList = Arrays.asList("X", "Y", "Z"); ArrayList<String> list = new
		 * ArrayList<>(anotherList);
		 */

		ArrayList<String> carlist = new ArrayList<>();

		// add
		carlist.add("lancer");
		carlist.add("BMW");
		carlist.add("TVS");
		carlist.add("CAR");
		carlist.add("BMW");
		carlist.add("Audio");
		carlist.add("Suzik");

		// add at specific index
		carlist.add(1, "TATA");

		// change value
		carlist.set(2, "Volvo");

		// delete a element
		carlist.remove(4);

		// sort
		Collections.sort(carlist);

		// sort in descending
		Collections.sort(carlist, Collections.reverseOrder());

		// Display
		System.out.println(carlist);

	}

}
