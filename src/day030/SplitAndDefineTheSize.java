package day030;

import java.util.Arrays;

public class SplitAndDefineTheSize {
    public static void main(String[] args) {

        String sentence="I love Java Java java";
//we used two version of split method
// in the second version
// f you have 5 words and split by space and put limit for 2
// you will get an array with size of two
        String []wordsArray1=sentence.split(" ");
        String []wordsArray2=sentence.split(" ",2);
        String []wordsArray3=sentence.split(" ",3);
        String []wordsArray4=sentence.split(" ",4);

        System.out.println("wordsArray1 = "+ Arrays.toString(wordsArray1));
        System.out.println("wordsArray2 = "+ Arrays.toString(wordsArray2));
        System.out.println("wordsArray3 = "+ Arrays.toString(wordsArray3));
        System.out.println("wordsArray4 = "+ Arrays.toString(wordsArray4));

    }
}
