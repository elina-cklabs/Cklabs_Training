package Collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class EmptySet {

	public static void main(String[] args) {
		 // create an empty set    
		 Set mySet = new HashSet();
	        mySet.add("one");
	        mySet.add("two");
	        mySet = Collections.emptySet();

	      System.out.println("Created empty immutable set: "+mySet);  
	      System.out.println(mySet);
	      // try to add elements
	      mySet.add("Adding");
	}

}
