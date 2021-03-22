package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SingletonList {

	public static void main(String[] args) {
		 String[] geekslist = { "1", "2", "4", "2", "1", "2", 
                 "3", "1", "3", "4", "3", "3" }; 
		List geekslist2 = new ArrayList(Arrays.asList(geekslist)); 
        System.out.println("\nOriginal geeklist2: " + geekslist2); 
  
        // Selectively delete "1" from 
        // all it's occurences 
        geekslist2.removeAll(Collections.singleton("1")); 
        System.out.println("geekslist2 after removal of 1 with "
                           + "singleton:" + geekslist2); 
	}

}
