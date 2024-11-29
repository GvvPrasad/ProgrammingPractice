package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilter {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Prasad");
		names.add("Prasanthi");
		names.add("Kumar");
		names.add("Sandeep");
		names.add("Prabath");
		
		ArrayList<String> names2 = new ArrayList<String>();
		
		names2.add("G v v");
		names2.add("Krishna");
		names2.add("Raj");
		names2.add("Raj");
		names2.add("Kumar");
		
		//no of names start with P
		long finalCount = names.stream().filter(s->s.startsWith("P")).count();
		System.out.println(finalCount);
		
		//display names of length >6
		names.stream().filter(s->s.length()>6).forEach(s->System.out.println(s));
		
		//display only one names of length >
		names.stream().filter(s->s.length()>6).limit(1).forEach(s->System.out.println(s));
		
		names.stream().filter(s->s.startsWith("P")).sorted().forEach(s->System.out.println(s));
		
		names.stream().filter(s->s.startsWith("P")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		Stream<String> newNames = Stream.concat(names.stream(), names2.stream());
		newNames.forEach(s->System.out.println(s));
		
		List<String> newList = names.stream().filter(s->s.startsWith("P")).sorted().map(s->s.toUpperCase()).collect(Collectors.toList());
		
		System.out.println("new: " +newList);
	}

}
