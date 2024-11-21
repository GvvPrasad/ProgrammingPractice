package string;

import java.util.Iterator;

public class DisplaySting {

	public static void main(String[] args) {
		
		//when values are same there will be only single object
		//string as object, string literal
		String s1 = "prasad";
		String s2 = "prasad";
		
		//string with 'new' keyword
		// here two objects will be created
		String s3 = new String("prasad");
		String s4 = new String("prasad");
		
		//Split
		String word ="Prasad is a QA Engineer";
		
		//split by word space
		String[] splitedArray = word.split(" ");
		for(String SW: splitedArray) {
			System.out.println(SW);
		}
		
		//Dislay by letter
		for (int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}
		
		//Display string in reverse order
		for(int i=word.length()-1;i>=0;i--) {
			System.out.print(word.charAt(i));
		}
	}

}
