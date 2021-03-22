package UtilsClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;

public class IOUtilsClass {

	 public static void main(String[] args) throws IOException {
	      
	            //Using BufferedReader
	            //readUsingTraditionalWay();

	            //Using IOUtils
	            readUsingIOUtils();
	        
	    }

	    //reading a file using IOUtils in one go
	    public static void readUsingIOUtils() throws IOException {
			/*
			 * File newfile = new File("input2.txt"); if(newfile.createNewFile()) {
			 * System.out.println("File create"); }else {
			 * System.out.println("File is not created"); }
			 */
	        try(InputStream in = new FileInputStream("input2.txt")) {
	            System.out.println( IOUtils.toString(in, "UTF-8") );
	        }
	    }
}
