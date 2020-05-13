package day06.day06;

import java.util.Scanner;

public class RemainderMore {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter minutes you would like to convert hour and minute format :");

        int minutes=scan.nextInt();//here we declared minutes as int
        // in the  following lines we should not use "scan" for
        // related hour and remainderHour variables one more time!!!
        int hour=minutes/60;
        int remainderHour=minutes%60;
         System.out.println("you entered  "+minutes+ "minutes"+"\n"+ "it is  "+hour+"  hours and "+remainderHour+ "  minutes");




    }
}
