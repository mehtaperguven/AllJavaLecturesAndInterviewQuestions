package day011;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TruthTableByIf {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter a number");
        int num=scan.nextInt();

        if (num<10 ||num>100 ){
            System.out.println(true );
        }else{
            System.out.println(false);
        }
    }
}
