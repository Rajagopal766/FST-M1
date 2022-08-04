package Activities;

public class Activity8 {
    public static void main(String []args){
        try {
            Activity8.exceptionTest("Will print to console");
            Activity8.exceptionTest(null);
            Activity8.exceptionTest("Won't execute");
        }
        catch(CustomException ce) {
            System.out.println("Inside catch block: " + ce.getMessage());
        }
    }

    static void exceptionTest(String s) throws CustomException {
        if(s == null) {
            throw new CustomException("String value is null");
        } else {
            System.out.println(s);
        }
    }
}
