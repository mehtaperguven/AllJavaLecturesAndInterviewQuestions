package day07;

import java.util.Scanner;

public class IfNoElse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter your score");
        int score=scan.nextInt();
        if( score <60 ){

            System.out.println("you failed");
        }
        System.out.println("your score is : "+score);
    }
}
