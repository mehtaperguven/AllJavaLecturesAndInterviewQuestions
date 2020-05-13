package day04.src.day05;

import java.util.Scanner;

public class GrocerySample {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("How many pound tomato you want to buy and store it:");
        int tomato = scan.nextInt();
        System.out.println("What is the tomato price:");
        float tomatoPrice = scan.nextFloat();
        float tomatoTotal = tomato * tomatoPrice;
        System.out.println("Total price for tomato is " +tomatoTotal+ " cents");

        System.out.println("How many pound potato you want to buy and store it:");
        int potato = scan.nextInt();
        System.out.println("What is the potato price:");
        float potatoPrice = scan.nextFloat();
        float potatoTotal = potato * potatoPrice;
        System.out.println("Total price for tomato is " +potatoTotal+ " cents");



    }
}
