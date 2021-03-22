package UtilsClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

public class LineIteratorClass {

	 public static void main(String[] args) {
	        try {
	            usingLineIterator();
	        } catch(IOException e) {
	            System.out.println(e.getMessage());
	        }
	    }

	    public static void usingLineIterator() throws IOException {
	        //get the file object
	        File file = FileUtils.getFile("input2.txt");

	        try(LineIterator lineIterator = FileUtils.lineIterator(file)) {
	            System.out.println("Contents of input.txt");
	            while(lineIterator.hasNext()) {
	                System.out.println(lineIterator.next());
	            }
	        }
	    }
}
