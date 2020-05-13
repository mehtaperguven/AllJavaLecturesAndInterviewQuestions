package day04.src.day06.day06;

import java.util.Scanner;

public class ScannerCapturingOneWord {
    public static void main(String[] args) {
        Scanner blabla=new Scanner(System.in);
        System.out.println("What is your name ?");
        String name=blabla.next();// it says give me a single word it does not take the second word!!!!
//it will capture only first word
        //int age=blabla.nextInt();
        //when we enter Mehtap Erguven Student
        System.out.println("You have entered "+ name);// it wil give only Mehtap
        String anotherWord=blabla.next(); //it will take another word
        System.out.println("Another word is "+anotherWord);// it will give Erguven
        //it will not show third word "Student"
       // System.out.println("You have entered "+age);


    }
}
