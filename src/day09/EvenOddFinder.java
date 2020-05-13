package day09;

public class EvenOddFinder {
    public static void main(String[] args) {

        //write a program that find out a number is even or odd
        //int myNumber ;
        //if even says "This is an even number"
        //if odd   "This is an odd number"

        int myNumber=459;
        System.out.println("My number is " +myNumber);
        int remNum=myNumber%2;
        System.out.println("Reminder is : "+ remNum);

        if (myNumber%2==0)
        //if (remNum== 0)
        {
            System.out.println("This is an even number");
        }
        else
        {
            System.out.println("This is an odd number");
        }
    }
}
