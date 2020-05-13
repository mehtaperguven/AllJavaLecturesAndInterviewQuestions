package day012;

import java.util.Scanner;

public class SeasonStringEqualsMethod {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your season please");
        String  season=scan.next();
        if (season.equalsIgnoreCase("Spring")){
            System.out.println("Hiking,Navruz,Alergy Season, cool ");
        }else if (season.equalsIgnoreCase("Summer")){
            System.out.println("Pool,Swimming,Vacation ");
        }else if (season.equalsIgnoreCase("Fall")){
            System.out.println("Barbecue,riding,JUST CODE!!! halloween");
        }else if(season.equalsIgnoreCase("Winter")){
            System.out.println("CODE!!!! Ski, Snowman");
        }else {
            System.out.println("INVALID ENTRY");

        }

    }
}
