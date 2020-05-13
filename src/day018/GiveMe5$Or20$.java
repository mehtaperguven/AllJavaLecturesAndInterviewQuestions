package day018;

import java.util.Scanner;

public class GiveMe5$Or20$ {
    public static void main(String[] args) {

        //keep asking for 5$ and 20$ until you get them

        //following if loop is only to check for one case !
        //int x=0;
        // if (x!=5 || x!=20){
        //System.out.println("NOT THE BILL I AM LOOKING FOR");
        //System.out.println("Give me 5 or 20");
        // }



        Scanner scan=new Scanner(System.in);
        System.out.println("Please give me 5 or 20");

        int x=scan.nextInt();
        while( !(x==5 ||x==20)){ //below while condition is exactly same with this code
        //while(x!=5 && x!=20){

            System.out.println("NOT THE BILL I AM LOOKING FOR");
            System.out.println("Please give me 5 or 20");
            x=scan.nextInt();
        }

        System.out.println("THE HAPPY ENDING !! GOT MONEY");


    }
}
