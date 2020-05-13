package day04.src.day05;

public class VariablePractice {
    public static void main(String[] args) {
        //8 primitive
        /* BLOCK COMMENT
        whole numbers: byte, short, int, long
        fractional numbers: float, double
        logical           : boolean (true, false)
        character         : char (single character in single quote)

        USUALLY by default for WHOLE NUMBERS use INT
        USUALLY by default for FRACTIONAL NUMBERS use DOUBLE
        Is string a part of Primitives ? NOOOOO!!!
        STRING is sequence of character, it is a text
         */

        //AGE CALCULATOR

        int birthYear=1976;
        int currentYear=2019;
        int myAge=currentYear-birthYear;
        String city= "Siirt";

        System.out.println("I was born in  " +city+  " in " + birthYear+ "\n"+ "  and I am   "+ myAge+"  years old." );


        //task 2
        // speed limit is  some number, your current speed is this
        // output should be "you are driving 10 mph more than speed limit.

        int speedLimit = 40;
        int currentSpeed= 58;
        int overTheLimit= currentSpeed-speedLimit;
        System.out.println("Speed Limit is "+speedLimit+ " , and your current speed is "+ currentSpeed );
        System.out.println("You are driving  " + overTheLimit+ "  mph more than " + speedLimit+ "  mph");


    }
}
