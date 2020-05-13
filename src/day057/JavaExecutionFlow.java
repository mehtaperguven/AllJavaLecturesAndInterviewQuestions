package day057;

public class JavaExecutionFlow {
    /*
    *Hello.java....>>>COMPILER=Javac...>>> Hello.class >>>>>Run
    *
    * Java codes are saved with .java extension
    * Compiler is checking syntax.
    * if something is wrong  COMPILE ERROR happens.red wave!!
    *
    * program runs line by line
    * when code is running it will run top to bottom
    * when java reaches a line that has error EXCEPTION ERROR gives
    *
    * COMPILE ERROR>>>>>During compile process
    * EXCEPTION ERROR>>>>>During RUNTIME process
    * For each Exception type in java there is a class as shown below:
    * ArrayIndexOutOfBoundsException ERROR
    * StringIndexOutOfBoundsException ERROR
    * if the index is out of bounds:
    * // int arr[]={1,2,3};
    * //System.out.println(arr[3]);
    * ArrayIndexOutOfBoundsException ERROR
    *******************************************
    //String str="java";
    //System.out.println(str.charAt(10));
    //StringIndexOutOfBoundsException ERROR
    *******************************************
    //RUN TIME EXCEPTIONS stop  the normal execution of the program!!!!!!

     *
     * STACK TRACE ====>>>>>Exception in thread "main" java.lang.ArithmeticException: / by zero
	at day057.ExceptionExample.main(ExceptionExample.java:17)
     *
     *
     * EXCEPTIONS ARE OBJECTS FROM THEIR OWN CLASSES
     * EXCEPTIONS
     *
     *
     *                 Object class (Parent class of all classes)
     *
     *                 Throwable class ====parent class of all exceptions
     *
     * Runtime error happens due to Environment issues
     *    ERROR Class                           EXCEPTION CLASS...........>>CHECKED EXCEPTIONS====subclass
     *
     * example1:OutOfMemoryError                               ...........>>UNCHECKED EXCEPTIONS===subclass of Exception
     *example2:StackOverFlow//stack is full
     *
     *
     * ERROR VS.EXCEPTION
     * Error: if there is any error impossible recover
     * >>happens during runtime
     *
     *
     * EXCEPTIONS
     * possible to recover, we can handle
     * Caused by programmer's code
     *
     * Exceptions class has two subclass
     * ###############################################
     * Checked Exceptions  and UnCheckedExceptions
     * ##############################################
     * Checked Exceptions:
     * Must handle by programmer otherwise code will not compile
     * exceptions that is checked by compiler during compile time
     *
     * Unchecked Exceptions :
     * ###############################################
     * Happen during runtime
     * It is optional to handle by programmer, it will still compile if programmer does not handle
     * They are also called RunTime Exceptions
     *
     * */
/**/


    public static void main(String[] args) {
//        int nums[]={1,2,3};
//        System.out.println(nums[3]);//no compiler error no red wave
//        //However when we run ArrayIndexOutOfBoundsException ERROR will give
//        System.out.println("hello b15");//will not print next row

        System.out.println("Hello world");
        String str="java";
        System.out.println(str.charAt(10));//At run time StringIndexOutOfBoundsException will give
        System.out.println("Hello world");
    }
}
