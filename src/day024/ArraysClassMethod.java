package day024;

import java.util.Arrays;

public class ArraysClassMethod {
    public static void main(String[] args) {
        /*
        * ARRAYS CLASS comes from JDK LIBRARY
        * //like
        * import java.util.Scanner; or
        * import java.util.String;
        * we use Arrays class in the following way
        * import java.util.Arrays;
        *
        * it comes from java.util package
        * it has a lot of pre-built methods to work with array object
        * for printing the content of the array
        * toString......>>> Arrays.toString(yourArrayHere)
        * //it gives string representation of any type of data!!!!
        * it print it in the next way...........>>[item1, item2,....]
        * ************************************************/
        String [] superHeros= {"Superman","Batman","Wonder Woman","Aquaman","Cyborg","Flash"};
        // below it gives only string text we can not take first element as Superman!!
        System.out.println(Arrays.toString(superHeros));
        String superHerosAsString=Arrays.toString(superHeros);
        System.out.println(superHerosAsString);
        //below it prints only the symbol "[" which is first character of the following string
        //[Superman, Batman, Wonder Woman, Aquaman, Cyborg, Flash]
        System.out.println(superHerosAsString.charAt(0));
int[] numbers={10,44,55,3,78};
        System.out.println(Arrays.toString(numbers));
        String numToString=Arrays.toString(numbers);
        System.out.println(numToString.substring(1,3));


         /*
         * for sorting an array in ascending order
        * sort........>>>Arrays.sort(yourArrayHere)
        * ***********************************************
        * for checking equality of two arrays' object content
        * equals............>>>> Arrays.equals(firstArray,secondArray)
        * */
    }
}
