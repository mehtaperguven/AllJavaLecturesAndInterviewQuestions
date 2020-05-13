package day025;

import java.util.Arrays;

public class StringToCharArrayMethod {
    public static void main(String[] args) {

        String name="Alesya";

        //how would you store each and every character
        //to a char array from above name
        //without using method we are about to learn

        char [] namesChars=new char [name.length()];

       // namesChars[0]=name.charAt(0);
        //namesChars[1]=name.charAt(1);

        for (int i=0; i< namesChars.length;i++){

            namesChars[i]=name.charAt(i);
        }
        //System.out.println(namesChars[0]);
        System.out.println("namesChars = "+ Arrays.toString(namesChars));

    char[] namesChars2=name.toCharArray();
        System.out.println("namesChars2 = "+Arrays.toString(namesChars2));


    }
}
