package streams;

import java.util.Arrays;
import java.util.List;

public class StreamNumbers {

	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList(5,10,11,13,5,8,8,11);
		values.stream().distinct().forEach(s->System.out.println(s));

	}

}
