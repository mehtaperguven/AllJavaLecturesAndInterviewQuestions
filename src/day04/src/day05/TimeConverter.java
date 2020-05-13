package day04.src.day05;

import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter day count  :");

        int dayCount=scan.nextInt();
        double totalCount= dayCount*1440;

        System.out.println("your total time count is :"+ totalCount+ " minutes");

    }
}
