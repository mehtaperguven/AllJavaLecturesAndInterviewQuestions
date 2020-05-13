package day063;

import javax.swing.*;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.*;

public class FindingUnique {
    public static void main(String[] args) {


        String str = "The new link for joining class will require you to login to Okta, if it ask you to sign in " +
                ", please just click on it , it will take you too Okta signin page , once you signin with Okta" +
                "Then you will be able to join right away. PLEASE DO NOT TRY TO REGISTER , THE LINK IS ALREADY IN THE EMAIL" +
                "Click to join";

    //HOw many unique character showed up in above sentence
        //first sway:create HashSet<> object to ignore duplication
        //iterate over each character in above string
        //then add it to HashSet<> object


        //Set<Character> charSet=new HashSet<>();//Gives unique characters without insertion order
        //Set<Character> charSet=new LinkedHashSet<>();//gives unique characters in the order first is printed first//first in first out
          Set<Character> charSet=new TreeSet<>();//Gives unique characters in natural order
    for (int i=0;i<str.length();i++){

        charSet.add(str.charAt(i));
    }
        System.out.println("Total characters in the str : "+str.length());
        System.out.println("All characters which are unique : " +charSet);
        System.out.println("Number of elements in the set:"+ charSet.size());

        for (Character each : charSet){
            System.out.println("Each character " + each);
        }


        //////SECOND WAY
        System.out.println("SECOND WAY");
        String [] arr=str.split("");
        Set<String> newCharSet=new TreeSet<>(Arrays.asList(arr));
        System.out.println(newCharSet);

        ////THIRD WAY
        String [] charStrArr= str.split("");
        System.out.println(Arrays.toString(charStrArr));
        System.out.println("number of elements in str  "+charStrArr.length);



       List<String> charLst=Arrays.asList(charStrArr);
        System.out.println("List list list \n"+ charLst);

       Set<String> charSet2=new HashSet<>(charLst);
       System.out.println("Set set set set :\n" + charSet2);

        System.out.println("++++++++++++++++++++");

        Set<String> charSet3=new HashSet<>(Arrays.asList(str.split("")));
        System.out.println(charSet3);






    }


}
