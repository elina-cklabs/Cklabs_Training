package Collections;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class MapExample {

	    public static void main(String[] args) {
	        // Creating a map using the HashMap
	        Map<String, Integer> numbers = new HashMap<>();

	        // Insert elements to the map
	        numbers.put("One", 1);
	        numbers.put("Two", 2);
	        System.out.println("Map: " + numbers);

	        // Access keys of the map
	        System.out.println("Keys: " + numbers.keySet());

	        // Access values of the map
	        System.out.println("Values: " + numbers.values());

	        // Access entries of the map
	        System.out.println("Entries: " + numbers.entrySet());
	        Set set = numbers.entrySet();
	        Iterator itr = set.iterator();
	        while(itr.hasNext()) {
	        	Map.Entry entry = (Map.Entry)itr.next();
	        	System.out.println(entry.getKey()+" "+entry.getValue());
	        }
	        // Remove Elements from the map
	        int value = numbers.remove("Two");
	        System.out.println("Removed Value: " + value);
	    }
	

}
