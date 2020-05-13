package day018;

import java.util.Scanner;

public class SmartLockOpener {
    public static void main(String[] args) {


    //smart lock of door has password
    //unless you enter correct password
    //it keep locking
    //assuming correct password is B15
    //keep asking user until enter correct one

    Scanner scan=new Scanner(System.in);
        System.out.println("KNOCK KNOCK!!");
        System.out.println("WHAT IS THE PASSWORD ? ");

        String password=scan.next();
    //while(!password.equalsIgnoreCase("B15")){  //we ignore the case in here!!
       while(!password.equals("B15")){

            System.out.println("WRONG PASSWORD !! TRY AGAIN!!");
            password=scan.next();
        }
        System.out.println("OPEN SESAME");
    }

}
