package interviewQuestionJava.StringInterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class FindingFrequencyOfCharacters {

    public static void main(String[] args) {
        String str = "AAAAAACCCCCCCCBBDDDD";

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
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("Second Way::::::::::::::::::::");

        String str1="AAAABBBBBCCDDD";
        String strOnlyUniques="";

        for (int i=0;i<str1.length();i++){//we find only unique elements
            if (!strOnlyUniques.contains(str1.charAt(i)+"")){
                strOnlyUniques+=""+str1.charAt(i);

            }
        }
        System.out.println("<<<<<<<"+strOnlyUniques);
        String stringKeyValue="";

        for (int i=0;i<strOnlyUniques.length();i++){
            int count=0;
            for (int j=0; j<str1.length();j++){

                if (str1.charAt(j)==strOnlyUniques.charAt(i)){
                    count++;
                }


            }
            stringKeyValue+=strOnlyUniques.charAt(i)+""+count;
        }
        System.out.println("character and its frequency "+stringKeyValue);

    }

}
