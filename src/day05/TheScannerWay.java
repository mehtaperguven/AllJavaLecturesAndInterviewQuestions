package day05;
import java.util.Scanner;// we are importing scanner
//the import statement must be in between your package declaration
// and beginning of the class
public class TheScannerWay {
    public static void main(String[] args) {
       // ask user for name
        //capture the result
        //print your name is....
        //ask user for birthYear
        //capture the result
        //print the age
        //ask user for height
        // capture the result
        // print the height
        Scanner scan=new Scanner(System.in);//we produce SCANNER OBJECT
        //scan is variable name it can be different name as well!!!
        System.out.println("What is your name   :");
        String name= scan.next();
        System.out.println("Your name is   : " +name);

        System.out.println("What is your birthYear   ?");
        int birthYear=scan.nextInt();
        int age=2019-birthYear;
        System.out.println("Your age is     : " +age);

        System.out.println("What is your height  ?");
        double height=scan.nextDouble();
        System.out.println("Your height is  :"+height);



    }
}
