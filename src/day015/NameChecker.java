package day015;

import java.util.Scanner;

public class NameChecker {
    public static void main(String[] args) {
        //name checker
        //declare a variable to store your name
        //check whether your name length is less than 4
        //if so print short name
        //if it is within 4-11
        //if so print medium name
        //if it is more than 11 print LONGER NAME

        //if name contains letter a print " Name contains a or e"
        //else print "There is not both a or e in name"
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your name please :");
        String name=scan.next();

        int lengthOfTheName=name.length();
        System.out.println("length Of The Name = " + lengthOfTheName);

        if (lengthOfTheName <4){
            System.out.println("SHORT NAME");

        }else if (lengthOfTheName <= 11 ){
            System.out.println("MEDIUM LENGTH");
        }else {

            System.out.println("LONGER NAME");
        }
        if (name.contains("a")|| name.contains("e")){
            System.out.println(" Name contains a or e");
        }else{
            System.out.println("There is not both a or e in name");
        }

    }
}
