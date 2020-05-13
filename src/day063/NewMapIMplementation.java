package day063;
import java.util.*;
public class NewMapIMplementation {
    public static void main(String[] args) {

        String str = "Fun Fun Fun Java Java is ending Tomorrow Tomorrow No It is never Ending";


        String[] allWords=str.split(" ");
        System.out.println("word's length = "+allWords.length);

        Map<String,Integer> wordFreMap=new HashMap<>();

    for (String currentWord: allWords){

        if (wordFreMap.containsKey(currentWord)==false){

            wordFreMap.put(currentWord,1);
        }else{
            int newCount=wordFreMap.get(currentWord)+1;
            wordFreMap.replace(currentWord,newCount);
        }
    }
        System.out.println(wordFreMap);





    }

}
