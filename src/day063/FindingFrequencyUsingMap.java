package day063;

import java.util.HashSet;
import java.util.*;
public class FindingFrequencyUsingMap {
    public static void main(String[] args) {

        // OPTIONALLY : USING THE PREVIOUS CLASS STRING

// TRY TO GET A charFrequencyMap
// your map should store character and it's frequency
//  AAABBCDDDD  -->> {'A'=3 , 'B'=2 , 'C'=1 ,'D'=4 ,  }
        String str = "The new link for joining class will require you to login to Okta, if it ask you to sign in " +
                ", please just click on it , it will take you too Okta signin page , once you signin with Okta" +
                "Then you will be able to join right away. PLEASE DO NOT TRY TO REGISTER , THE LINK IS ALREADY IN THE EMAIL" +
                "Click to join";

        Map<Character,Integer> chrFrequency=new HashMap<>();

        for (int i=0;i<str.length();i++){
            char currentChar=str.charAt(i);
            if (!chrFrequency.containsKey(currentChar)){
                System.out.println("Entering for the first time " + currentChar);
                chrFrequency.put(currentChar,1);
               

            }else{
                System.out.println("Incrementing the count of " + currentChar + " by one and replacing old count");
            chrFrequency.replace(currentChar,chrFrequency.get(currentChar)+1);

            }
        }
        System.out.println(chrFrequency);



        // if we do not have the key yet , it means we are entering for the first time
        // the count will be 1
//        if (!charFreq.containsKey(currentChar)) {
//            System.out.println("Enter for the first time " + currentChar);
//            System.out.println("Entering for the first time " + currentChar);
//            charFreq.put(currentChar, 1);
//
//        } else {
//            // if we come to this point it means it has already showed up
//            // so we update the count with 1 extra than existing count
//            System.out.println("Incrementing the count of " + currentChar + " by one and replacing old count");
//            charFreq.replace(currentChar, charFreq.get(currentChar) + 1);
//
//        }


    }
}
