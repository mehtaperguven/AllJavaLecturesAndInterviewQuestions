package day017;

import java.util.Scanner;

public class NamePrinter {
    public static void main(String[] args) {
// if you complain in life call1-800-Alexander
//task
        //print each character vertically
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter your name ");
        String name=scan.nextLine();
        System.out.println("name length is: "+name.length());
       /* int x=0;
        System.out.println(name.charAt(x));
        ++x;
        System.out.println(name.charAt(x));
        ++x;
        System.out.println(name.charAt(x));
        ++x;
        System.out.println(name.charAt(x));
        ++x;
        System.out.println(name.charAt(x));
        ++x;
        System.out.println(name.charAt(x));*/

        System.out.println("***************************");
        //SHORT WAY TO PRINT VERTICALLY

        int y=0;
        //while(y<=name.length()-1) will give the same as below
        while(y<name.length()){
        System.out.println(name.charAt(y));
        ++y;}


        System.out.println("****************************");


//print entered name by index no and vertically

        int z=0;
        while (z<name.length()){

            System.out.print("index "+z+" : ");
            System.out.println(name.charAt(z));
            ++z;
        }
    }

}
