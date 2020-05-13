package day07;

import java.util.Scanner;

public class emailBuilder1 {
    public static void main(String[] args) {
        // create a class called EmailBuilder with main method
        // create 3 String variable for first name  last name , company
        // create another variable for email
        // create email in this format firstName_lastName@company.com
        // print out the result as , my name is <your full name> and I work for <company> and my email is <email>

        Scanner scan =new Scanner(System.in);
        System.out.println(" Please enter your first name,last name, company separated by space ");
        String firstName, lastName, company, email;

        firstName=scan.next();
        lastName=scan.next();
        company= scan.next();

        email=firstName+"_"+lastName+"@"+company+".com";

        System.out.println("your first name is " + firstName+ " and last name is "+lastName+
                "\n" +"You work for the "+ company+" company" +
                "\n"+"Your email is : "+email);

    }
}
