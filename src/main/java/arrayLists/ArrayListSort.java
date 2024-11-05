package arrayLists;

import java.util.ArrayList;

public class ArrayListSort {

	static ArrayList<String> carlist = new ArrayList<>();

	public static void main(String[] args) {

		// add
		carlist.add("lancer");
		carlist.add("BMW");
		carlist.add("TVS");
		carlist.add("CAR");
		carlist.add("BMW");
		carlist.add("Audio");
		asscending();
		deasscending();
	}

	public static void asscending() {
		for (int i = 0; i < carlist.size(); i++) {
			for (int j = i + 1; j < carlist.size(); j++) {
				String temp;
				if (carlist.get(i).compareTo(carlist.get(j)) > 0) {
					temp = carlist.get(i);
					carlist.set(i, carlist.get(j));
					carlist.set(j, temp);
				}
			}
		}
		System.out.println(carlist);

	}

	public static void deasscending() {
		for (int i = 0; i < carlist.size(); i++) {
			for (int j = i + 1; j < carlist.size(); j++) {
				String temp;
				if (carlist.get(i).compareTo(carlist.get(j)) < 0) {
					temp = carlist.get(i);
					carlist.set(i, carlist.get(j));
					carlist.set(j, temp);
				}
			}
		}
		System.out.println(carlist);

	}

}
