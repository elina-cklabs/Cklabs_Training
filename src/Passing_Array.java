
public class Passing_Array {

    public static void main(String[] args) {
	//Declaring an Array
	String [] carMake = {"BMW","AUDI","TOYOTA","SUZUKI","HONDA"};
	int iLength = carMake.length;
		System.out.println("Length "+iLength);
		
		//This is to access the last element of an Array
        String sHonda = carMake[iLength-1];
        System.out.println("Last value of the Array is ==> " + sHonda);
		//F6
	// Calling Print_Array method and passing carMake as a parameter
	printArray(carMake); //F5
    }

    //This method accepts Array as an argument of type String 
    public static void printArray(String []cars){
	for(int i=0; i <= cars.length-1; i++){
	    System.out.println( cars[i] );
        }
    }     //F8
}
