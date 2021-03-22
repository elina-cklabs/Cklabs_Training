package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {

	public static void main(String[] args) {
		Set<String> names = new HashSet<>();
		names.add("Tom");
		names.add("Mary");
		names.add("Peter");
		names.add("Alice");

		//Create an Iterator
		Iterator<String> iterator = names.iterator();

		while (iterator.hasNext()) {
		    String name = iterator.next();
		    System.out.println(name);
		}

	}

}
