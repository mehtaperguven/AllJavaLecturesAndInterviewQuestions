package day04.src.day06;

import java.util.Scanner;

public class ScannerCapturingMultipleWord {
    public static void main(String[] args) {
        //task 4
//use next Line to ask your bio
//What is your name
//What city you live in, including state, Tyson, VA
// What is your street address

        Scanner blabla=new Scanner(System.in);
        System.out.println("What is your name ?");
        String name=blabla.nextLine();//nextLine captures all line
        System.out.println("Your name is "+ name );// short

        System.out.println("What is your state and your city ?");
        String stateCity=blabla.nextLine();
        System.out.println("Your state and your city is  "+ stateCity );

        System.out.println("What is your street address ?");
        String streetAddress=blabla.nextLine();
        System.out.println("Your street address is   "+ streetAddress );


    }
}
