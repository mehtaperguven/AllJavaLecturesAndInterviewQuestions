package day034;

import java.util.Arrays;

public class MethodOVerLoadingIntro {
    public static void main(String[] args) {
        System.out.println("Method overLoading");
        System.out.println(12);
        //           01234567890
        String name = "OverLoading";
        System.out.println(name.substring(6));
        System.out.println(name.substring(1, 4));

        System.out.println(name.indexOf("di"));
        System.out.println(name.indexOf("o", 2));
        System.out.println();


        //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
        //*************************************
        //METHOD OVERLOADING
        //using SAME METHOD NAME and different parameters for methods
        //to reuse the name for similar actions
        //access modifier "public" or return type"void" does not matter
///we can not have two methods that same method name and same type parameters
 //METHOD NAME+ METHOD PARAMETERS = METHOD SIGNATURE
 //  sayHello(String name) is METHOD SIGNATURE!!!!
        sayHello();
        sayHello("Universe");
        sayHello(5);
        System.out.println(sayHello("ozlem","demirkiran"));;

    }public static void sayHello(){
        //public static void sayHello() we name as method header
        System.out.println("Hello World");
    }
    public static void sayHello(String name){
        System.out.println("Hello "+name);
    }
    public static void sayHello(int num){
        System.out.println("Hello "+num);
    }
    //public static void sayHello(int x){

    //}
    public static String sayHello(String firstName,String lastName){
        return "Hello "+firstName+" "+lastName;
    }
}
