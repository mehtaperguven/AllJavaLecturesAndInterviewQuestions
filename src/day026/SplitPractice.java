package day026;

import java.util.Arrays;

public class SplitPractice {
    public static void main(String[] args) {

        //String Methods Related to Array
        //toCharArray();  and // split(by something);

        String survey="Complete B15 Online 1 Month Survey";

        char[] surveyChars=survey.toCharArray();

        for (char each :surveyChars){
            System.out.println("each char is : "+each);
        }
int x=0;
        while(x<surveyChars.length){
            System.out.println("each element of surveyChars is : "+surveyChars[x]);
            x++;
        }

        int y=0;
        do{

            System.out.println(" each element of surveyChars is : "+surveyChars[y]);
y++;
        }while(y<surveyChars.length);



    }
}
