package day08;


import java.util.Scanner;

public class WarmUpTask {
    public static void main(String[] args) {

        /* Voting Eligibility Program
         * produce variable age as int
         * check this age is more than 18
         * if yes print " you are ready to vote!!!"
         * if it is less than 18 print "Please wait until you are 18 "
         */

        /* guess your favorite number
        variable is myFavoriteNumber as int
        ask user to guess your favorite number
        if user guess right then print BINGO!!!
        if not print try again later
         */

        int age = 41;
        if (age >=18) {
            System.out.println("you are ready to vote!!!");

        }
        else {
            System.out.println("Please wait until you are 18 ");
        }

        System.out.println("\n");

        Scanner scan = new Scanner(System.in);
        System.out.println("guess my favorite number ");
        int guessedFavNumber = scan.nextInt();

        if (guessedFavNumber == 400) {
            System.out.println("BINGO");

        } else {

            System.out.println("Try again later !!!!");
        }

    }
}



