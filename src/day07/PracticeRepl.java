package day07;
import java.util.Scanner;

public class PracticeRepl {

    public static void main(String[] args) {

            Scanner scan=new Scanner(System.in);
            int hour,minute,second,amOrPm;
            hour=scan.nextInt();
            minute=scan.nextInt();
            second=scan.nextInt();
            amOrPm=scan.nextInt();
            System.out.println(hour+ ":"+ minute+ ": " +second+ ""+ amOrPm);

        }
    }


