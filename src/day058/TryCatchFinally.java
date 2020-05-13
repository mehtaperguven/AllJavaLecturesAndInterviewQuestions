package day058;

import org.w3c.dom.ls.LSOutput;

public class TryCatchFinally {
    public static void main(String[] args) {
        System.out.println("Before try catch");
        try{
            System.out.println("Hello Friends");
         String str=null;//we assigned as null
            //it is reason for NullPointerException
            //if we don't use try catch block
            // NullPointerException appears at run time
            System.out.println(str.length());

       }catch (Exception e){
            System.out.println("If Exception happened it is caught and this line printed");
        }
       System.out.println("After try catch");

        System.out.println("&&&&&&&&&&&&&&");

        try{
            System.out.println("Hello From try block");
            String str=null;//we assigned as null
            System.out.println(str.length());

        }catch (Exception e){
            System.out.println("Exception happened it is caught and this line printed");
        } finally{
            System.out.println("Finally block..Runs if there is exception or no exception");
        }

    }
}
