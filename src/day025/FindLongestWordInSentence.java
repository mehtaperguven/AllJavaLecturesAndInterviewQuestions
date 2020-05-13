package day025;

import java.util.Arrays;

public class FindLongestWordInSentence {
    public static void main(String[] args) {

        String sentence="We all love Java coding intensively";

        String [] allWords=sentence.split(" ");

        System.out.println(" all words array is "+ Arrays.toString(allWords));
        String longestWord="";

        for (String currentWord: allWords) {
            System.out.println(currentWord);

            if (currentWord.length() >longestWord.length()){
            longestWord=currentWord;
            }
        }
        System.out.println("longest word is : "+longestWord);


    }
}
