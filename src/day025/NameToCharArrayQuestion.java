package day025;

import java.util.Arrays;

public class NameToCharArrayQuestion {
    public static void main(String[] args) {

        //pickup your own name and turn into char array
        //use for each loop
        //

        String myName = "zeyneb";

        char[] nameArray = new char[6];
        for (int i = 0; i < myName.length(); i++) {
            nameArray[i] = myName.charAt(i);

        }
        System.out.println(Arrays.toString(nameArray));
        System.out.println(nameArray[1]);

        /////////////use toCHarArrayMethod////
        char[] charName = myName.toCharArray();


        for (char charOfMyName : charName) {
            System.out.println("charoFMyName " + charOfMyName);

        }

        // now count ohw many a we have
        int count = 0;

        for (char charOfMyName : charName) {

            if (charOfMyName == 'e') {
                ++count;
            }
        }
        System.out.println("there is  " + count+" e ");

        //what if you want to sort all characters of your name
        //in alphabetical order

        System.out.println("before sorting "+Arrays.toString(charName));
        Arrays.sort(charName);
        System.out.println("After sorting  "+ Arrays.toString(charName));
    }
}