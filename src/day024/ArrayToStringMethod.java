package day024;

import java.util.Arrays;

public class ArrayToStringMethod {
    public static void main(String[] args) {
        /*
        * form  a double [] array of three items called prices and put 3 value
        //get a string representation out of this array and save it as pricesString
        //print each and each character in this string in the folowing format
        //character at index 1 is :yourCharacterHere
        //character at index 2 is: yourCharacterHere*/
        double prices[]={40.5,8.9,90.4};
        String  pricesString= Arrays.toString(prices);
        System.out.println(pricesString);

        int length=pricesString.length();
        for (int i = 0; i <length ; i++) {
            System.out.println("character at index "+i+ " is :"+pricesString.charAt(i));
        }
    }
}
