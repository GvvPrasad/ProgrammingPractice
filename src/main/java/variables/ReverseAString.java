package variables;

public class ReverseAString {

	public static void main(String[] args) {
		String name = "Giduthuri Venkata vara Prasad";
		String reverse = "";
		char letter;
		
		for (int i = 0; i < name.length(); i++) {
			letter = name.charAt(i);
			reverse = letter+reverse;
			
		}
		System.out.println(reverse);
	}

}
