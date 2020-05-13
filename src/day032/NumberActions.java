package day032;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class NumberActions {
    public static void main(String[] args) {
        /*TASK1
        static void method numberComparison
        this method has two parameters num1, num2
        if num1>num2 print num1 is more than num2
        if num2<num1 print num2 is more than num1
        if they are equal print they are equal
        //TASK2
        String repeater
        //this method has 2 parameters
        String strToRepeat, int count
        repeat printing the string as many time as count number given!

    Create static void methods as below
 *
 * numberComparision
 * this method has 2 parameters called num1 and num2
 * if num1 is more than num2 print num1 is more than num2
 * if num2 is more than num1 print num2 is more than num1
 * if num2 are equals num1 print they are equal
 *
 * String repeater
 * this method has 2 parameters
 *     String strToRepeat and int count
 *    repeat printing the string as many time as <count> number define
 *
 * skipCountBy3From0to50
 *
 * * create a method that has no parameter
 * and skip count by 3 from 0 to 50
 *
 * countDownByEvenNumberFrom50to0
 * * create a method that has no parameter
 * and count Down By Even Number From 50 to 0
 * for example 50 , 48 , 46 .....0
 *
 * print1toX
 * * create a method that has 1 int parameter called x
 * print from 1 to that number in one line
 * print an empty line after the print.
 *     */
        /*Scanner scan=new Scanner(System.in);
        System.out.println("Enter num1 and num2");
       int num1=scan.nextInt();
       int num2=scan.nextInt();*/
        numberComparison(5, 8);
       /* System.out.println("Enter the word to repeat");
        String strToRepeat=scan.next();
        System.out.println("Enter count");
        int count=scan.nextInt();*/
        stringRepeater("java", 4);
        countBySkipping();
        from1Tox(13);
        countDownByXtoY(5,0);
        countDownByEvenNumberFrom50to0();
      //  countDownByXtoY(8,18);
    }

    public static void numberComparison(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 + " is more than " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + " is more than " + num1);
        } else {
            System.out.println("The numbers are equal");
        }
        System.out.println();
    }

    public static void stringRepeater(String strToRepeat, int count) {

        for (int i = 0; i < count; i++) {
            System.out.println(strToRepeat);
        }
        System.out.println();
    }

    public static void countBySkipping() {
        for (int i = 0; i < 50; i = i + 3) {

            System.out.print(i + " ");
        }
    }

    public static void countDownByEvenNumberFrom50to0() {
        //for (int i = 50; i >= 0; i--) {
           // if (i % 2 == 0) {
           //     System.out.print(i + " ");
           // }
       // }
      //  System.out.println();
        countDownByXtoY(50,0);
                }
                //above we called method countDownByXtoY()
                // inside the method countDownByEvenNumberFrom50to0()
    //however to execute we should write it in the main method as
    //countDownByEvenNumberFrom50to0()
    public static void countDownByXtoY(int x, int y) {
        for (int i = x; i >= y; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }
        System.out.println();
    }
        public static void from1Tox(int x) {
            for (int i = 1; i <= x; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

