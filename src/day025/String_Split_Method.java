package day025;

import java.util.Arrays;

public class String_Split_Method {
    public static void main(String[] args) {

        //split is String method that splits string
        // divides string into several perts
        //While calling split method we should provide extra data
        //in the next exercise we used " " while splitting
        //We get string array as a Result

        String sentence="I Love Java";

        String []allWords=sentence.split(" ");
        System.out.println(Arrays.toString(allWords));
        System.out.println("How many word do I have in the given sentence "+allWords.length);
        //let us print last element of allWords String Array
        int length=allWords.length;
        System.out.println(allWords[length-1]);
        System.out.println("*******************");
        // Let us split by e
        String sentence2="Everything is Awesome !!!!";
//we convert sentence to array in the next row and split by "e"
        String [] splitBy_e_Array=sentence2.split("e");
        System.out.println("splitBy_e_Array = "+Arrays.toString(splitBy_e_Array));

        for (String eachPieces:splitBy_e_Array) {
            System.out.println("eachPieces =<"+eachPieces+">");
        }
        //split by "is"

        String [] split_By_Is=sentence2.split("is");
        System.out.println("split_By_Is = "+Arrays.toString(split_By_Is));
        
        for(String eachPart:split_By_Is){
            System.out.println("eachPart = " + eachPart);
        }

    }
}
