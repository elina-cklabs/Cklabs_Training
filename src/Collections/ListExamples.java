package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ListExamples {

	public static void main(String[] args) {
    ArrayList<Integer> arrL2 = new ArrayList<Integer>(Arrays.asList(12,13,15));    
    arrL2.add(12);
    arrL2.add(13);
    arrL2.add(14);
   
	/*
	 * for(int i=0;i<arrL2.size();i++) { System.out.println(arrL2.get(i)); }
	 */
    System.out.println(arrL2);
    //arrL2.remove(0);
    arrL2.remove(2);
    arrL2.remove(Integer.valueOf(12));
    arrL2.remove(Integer.valueOf(12));
    System.out.println(arrL2);
    
	}
	
}
