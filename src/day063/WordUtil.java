package day063;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class WordUtil {
    public static void main(String[] args) {
        String str1 = "Hello Hello Hi Java Java";
        String[] arr = str1.split(" ");
        Map<String, Integer> neMap = new HashMap<>();
//        String str = "Fun Fun Fun Java Java is ending Tomorrow Tomorrow No It is never Ending";
//        System.out.println(getFrequencyMap(str));

        for (String eachWord : arr) {
if (!neMap.containsKey(eachWord)) {
    neMap.put(eachWord, 1);
}else{
    neMap.put(eachWord, neMap.get(eachWord)+1);
}
        }

        System.out.println(neMap);


    String str2="Hello, Hello, let; usuuu be hardworking";
    String[] arrChar=str2.split("");

    Map<String,Integer> charMap=new HashMap<>();

        for (String each:arrChar){

            if (charMap.containsKey(each)){

                charMap.put(each,charMap.get(each)+1);
            }else{
                charMap.put(each,1);
            }
        }

        System.out.println(charMap);



    }
    public static Map<String, Integer> getFrequencyMap(String str){

        Map<String,Integer> wordFreqMap=new HashMap<>();
        String[] allWords= str.split(" ");

for (String word:allWords){

    if (!wordFreqMap.containsKey(word)){
        wordFreqMap.put(word,1);
    }else{
        wordFreqMap.replace(word,wordFreqMap.get(word)+1 );
    }
}

        return  wordFreqMap;
    }
}
