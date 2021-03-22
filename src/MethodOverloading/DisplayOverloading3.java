package MethodOverloading;

public class DisplayOverloading3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplayOverloading3 dsp = new DisplayOverloading3();
		dsp.disp(3,'P');
	}
	
	  public void disp(char c, int num) {
	        System.out.println("First definition of method disp");
	    }

	    //int first, char second
	    public void disp(int num, char c) {
	        System.out.println("Second definition of method disp" );
	    }

}
