package day06;

import java.util.Scanner;

public class SaleCalculator {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("What is the regular price of tomato:");
        float regularPrice = scan.nextFloat();// variable1
        System.out.println("What is discount percentage:");
        float disPercentage = scan.nextFloat();// variable2
        float discount=(regularPrice*disPercentage)/100;

        System.out.println("discount is:  "+ discount);
        float salePrice = regularPrice-discount;// variable3
        System.out.println("Regular price is " +regularPrice+ " $,"+" discount is "+discount+" $"+ " and you will pay only "+salePrice+" $"  );

    }
}
