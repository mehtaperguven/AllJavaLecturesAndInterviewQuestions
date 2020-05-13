package day04.src.day04;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        // i want to get users input after asking some questions
        //I want to save this input so i can do something with it


        //Step 1: Use scanner class to create scanner object
        Scanner scan=new Scanner(System.in);

        //ask user to enter name
        System.out.println("Enter your first name please   :");

        //capture user typed on keyboard in class
        String firstName= scan.next();
        System.out.println("You have entered   :" +firstName);

        System.out.println("Enter your last name please   :");
        String sName= scan.next();
        //scan.next() is  to capture single word that user entered

        //print the result  what we save from user input
        System.out.println("You have entered   :" +sName);


        System.out.println("What is your age   ?" );
        int age=scan.nextInt();///// it is to capture entered number integer
        System.out.println("Your age is   :" +age);

    }
}
