package day017;

import java.util.Scanner;

public class NameReverseByOddIndex {
    public static void main(String[] args) {
        //print odd numbers index in your name optionally
        //find length  find odd index print in inverse order by index
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter your name ");
        String name=scan.nextLine();
        int z = name.length()-1;
        while (z >= 0) {
            if (z%2!=0){
                System.out.println("index is : "+z+" "+name.charAt(z));
            }

           --z;
        }
    }
}