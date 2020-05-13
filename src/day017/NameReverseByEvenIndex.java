package day017;

import java.util.Scanner;

public class NameReverseByEvenIndex {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter your name ");
        String name=scan.nextLine();

        int x=name.length()-1;
       while(x >=0){
           if (x%2==0) {
               System.out.println("index is "+x+" " +name.charAt(x));
           }
           --x;
       }


    }
}
