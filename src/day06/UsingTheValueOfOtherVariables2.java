package day06;

import java.util.Scanner;

public class UsingTheValueOfOtherVariables2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("what is your order ?I want the same  ");

        String yourOrder = input.next();
        String myOrder =yourOrder;
        System.out.println("Your order is " + yourOrder+ "\n"+
                "My order is " + myOrder + " as well");

    }
}
