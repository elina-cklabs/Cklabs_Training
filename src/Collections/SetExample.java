package Collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set<String> names = new HashSet<>();
		names.add("Tom");
		names.add("Mary");
		names.add("Peter");
		names.add("Alice");
		names.add("Mary");
		 
		System.out.println("The set has " + names.size() + " elements");
		System.out.println(names);
	}

}
