package day059;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ExceptionPractice {
    public static void main(String[] args) {


        String name="Furkan";
      // System.out.println(name.charAt(100));//unchecked error
    //we are calling charAt() method from String class
        //At runtime it throws StringIndexOutOfBoundsException
        Scanner input=new Scanner(System.in);
        System.out.println("Which index you want to get from Furkan's name? ");
        int targetIndex=input.nextInt();
try {

    System.out.println(name.charAt(targetIndex));
//}catch(Exception e) {
}catch(StringIndexOutOfBoundsException e){//it will narrow down the catch block
    //to catch StringIndexOutOfBoundsException
    System.out.println("Message by ....e.getMessage.... "+e.getMessage());
    //since we have Exception object and its container "e"
    // we can use pointer e to call getMessage();
            System.out.println("We found something unusual, unchecked exception and handle");
        }
        System.out.println("End");

        //Exceptions are object, so it has its own class
        //Hence we can produce our object as shown below
       StringIndexOutOfBoundsException  strError=new StringIndexOutOfBoundsException();
       System.out.println( strError.toString());

        List<Integer> lst=new ArrayList<>(Arrays.asList(1,8,4,9));

        System.out.println(lst);
    }
}
