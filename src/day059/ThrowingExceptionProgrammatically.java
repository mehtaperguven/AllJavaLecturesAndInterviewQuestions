package day059;

public class ThrowingExceptionProgrammatically {

    public static void main(String[] args) {

        NullPointerException e1=new NullPointerException();

        NullPointerException e2=new NullPointerException();
        System.out.println(e2.getMessage());


     //  System.out.println(e2);

      throw e2;//java throw exception at run time only!!
       //System.out.println("end");//it gives compile error if we use this line after throw
        //if we use only System.out.println(e2); and
        // System.out.println("end") will not give compile problem

        //IF we use throw e2; we will not be able to print next code

    //throws in declaration only documenting
        // throws keyword is used only in method signature
    }
}
