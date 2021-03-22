public class Activity2_4 {
    public static void main(String[] a) throws CustomException{
        try {
            Activity2_4.exceptionTest("Will print to console");
            Activity2_4.exceptionTest(null);
            int i = 2/0;
            Activity2_4.exceptionTest("Won't execute");
        } catch(Exception mae) {
            System.out.println("Inside catch block: " + mae.getMessage());
        }
       
    }

    static void exceptionTest(String str) throws CustomException {
        if(str == null) {
            throw new CustomException("String value is null");
        	//System.out.println("String is null");
        } else {
            System.out.println(str);
        }
    }
}
