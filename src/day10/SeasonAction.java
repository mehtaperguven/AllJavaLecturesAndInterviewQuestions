package day10;

import java.util.Scanner;

public class SeasonAction {
    public static void main(String[] args) {
        /*
        what do you do in each season
        *spring.....Hike! Easter,Nawruz, Blossom
        Summer..... Swim,Vacation, BBQ, Holiday
        Fall.....Black Friday, Hiking, Harvest, Halloween, Shopping
        Winter.....Snowboarding, Ski, Christmas, New Year
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please select the season: ");
        String  season=scan.next();
        //we can use byte,short, int, char, String in switch
        //we can use switch for checking multiple possible exact value of a variable
        //data types are limited to byte,short, int,char, String;
        //Switch has very clear view
        // in if statement there is no limit or restriction fo data types
        switch(season){

            case "Spring":
                System.out.println("Hike! Easter,Nawruz, Blossom");
                break;
            case "Summer":
                System.out.println("Swim,Vacation, BBQ, Holiday");
                break;
            case "Fall":
                System.out.println("Black Friday, Hiking, Harvest, Halloween, Shopping");

            break;
            case "Winter":
                System.out.println("Snowboarding, Ski, Christmas, New Year");
                break;
            default:// break is optional for default part;
                //Because after default switch statement is finished;

                System.out.println("You did not choose season");

        }


    }
}
