package day06.day06;

import java.util.Scanner;

public class NextLine_NextX_MixtureProblem {
    public static void main(String[] args) {
        Scanner blabla=new Scanner(System.in);
        System.out.println("What is your name  ?");
        String name=blabla.nextLine();
        System.out.println("Your name is "+name);

        System.out.println("What is your age  ?");
        int age=blabla.nextInt();
        //String age=blabla.nextLine();
        blabla.nextLine();
        /* if we do not write this part,
        the code is capturing directly the sentence "your address is " and
        does not allow us to enter address
         */
        System.out.println("Your age is "+age);


        System.out.println("What is your address ?");
        String address=blabla.nextLine();
        System.out.println("Your address is  :"+address);

    }
}
