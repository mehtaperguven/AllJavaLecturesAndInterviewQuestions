package day059;

public class FinallyBlock {
    public static void main(String[] args) {

        //in some cases we want to run certain code
        //no matter exception happens or not
        //finally is added to the try catch block


        int[] nums = {1, 8, 9};


        try {
            System.out.println("nums[5] = " + nums[5]);

            //above code has same result as below code
           // throw new ArrayIndexOutOfBoundsException("Index 5 out of bounds for length 3");

        } catch (Exception e) {

            System.out.println("Exception caught \n"+e.getMessage());
        }finally {
            System.out.println("This code will run always no matter we have Exception or not");
        }

        System.out.println("The End");
    }
}
