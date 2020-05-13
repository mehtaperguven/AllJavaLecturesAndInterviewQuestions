package day017;

import java.util.Scanner;

public class WakeUp_FullNameCorrector2 {
    public static void main(String[] args) {
        // use scanner to get  name from the user
        //Enter Name as two words
        //correct first name as: first letter uppercase reminder lowercase
        //correct last name as :first letter uppercase reminder lowercase
        //print corrected full name
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your full name in 2 words");
        String fullName = scan.nextLine();
        System.out.println("full Name is " + fullName);

        int indexOfSpace= fullName.indexOf(" ");

        String firstName = fullName.substring(0, indexOfSpace);

        String lastName = fullName.substring(indexOfSpace+1);

        String firstNameCorrected = firstName.toUpperCase().substring(0, 1) +
                firstName.toLowerCase().substring(1);
        System.out.println("firstNameCorrected = " + firstNameCorrected);


        String lastNameCorrected = lastName.toUpperCase().substring(0, 1) +
                lastName.toLowerCase().substring(1);

        System.out.println("lastNameCorrected = " + lastNameCorrected);


        fullName = firstNameCorrected + " " + lastNameCorrected;

        System.out.println("full Name Corrected is: " + fullName);
    }
}