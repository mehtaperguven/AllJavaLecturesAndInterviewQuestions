package day034;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MethodThatReturnMoreThanOneValue {
    public static void main(String[] args) {

String sentence="I love Java";
String[] eachWords=sentence.split(" ");
char [] eachChar=sentence.toCharArray();
        System.out.println(Arrays.toString(eachChar));

        int [] resultArr=returnBoysVsGirlsResult(55,57);
        System.out.println(Arrays.toString(resultArr));
    }
    //task: a method that return int array returnBoysVsGirlsResult;
    public static int[] returnBoysVsGirlsResult(int numGirls,int numBoys){
        int [] boysGirlsCount={numGirls,numBoys};
        return boysGirlsCount;
    }
}
