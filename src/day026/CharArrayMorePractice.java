package day026;

import java.util.Arrays;

public class CharArrayMorePractice {
    public static void main(String[] args) {

        String survey="Complete B15 Online 1 Month Survey";

        char[] surveyChars=survey.toCharArray();
        System.out.println("BEFORE sort surveyChars : "+ Arrays.toString(surveyChars));
       Arrays.sort(surveyChars);
        System.out.println("AFTER sort surveyChars : "+Arrays.toString(surveyChars));

    }
}
