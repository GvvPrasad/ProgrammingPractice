package arrayLists;

import java.util.ArrayList;
import java.util.Iterator;

public class StartingLetter {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		int count =0;
		
		names.add("Prasad");
		names.add("Prasanthi");
		names.add("Kumar");
		names.add("Sandeep");
		names.add("prabath");
		
		for(int i=0;i<names.size();i++) {
			if (names.get(i).startsWith("P") || names.get(i).startsWith("p")) {
				count++;
			}
		}
		System.out.println(count);

	}

}
