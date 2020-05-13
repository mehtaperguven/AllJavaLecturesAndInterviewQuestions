package day059;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPractice2 {
    public static void main(String[] args) {
        System.out.println("The start");
        String name="Ervav";

        Scanner input=new Scanner(System.in);
        System.out.println("Insert index of the character which you want to print");

        try{
           int targetIndex=input.nextInt();
            System.out.println(name.charAt(targetIndex));

        }catch (StringIndexOutOfBoundsException  e) {
            //if we have Index problem will catch exception
            System.out.println("You had index exception,index is out of bounds");
            //if we have Input problem instead of number
            //if we insert character, StringIndexOutOfBoundsException
            //would not be able to catch  InputMismatchException !!!!!!
            System.out.println("Enter between 0 and "+name.length());

      }catch(InputMismatchException e1){
            //  can catch input exceptions ..if....input="abc"
            //  }
            System.out.println("You have input problem, enter numbers!");
            System.out.println("If you enter number 0 you will get "+name.charAt(0));
        }catch(Exception e){}
        System.out.println("If I do not catch any exception in above two catch blocks I'll come here");
        System.out.println("End");


//As shown above we can use many catch blocks
        //Or many try catch blocks as well

    }
}
