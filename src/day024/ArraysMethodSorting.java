package day024;

import java.util.Arrays;

public class ArraysMethodSorting {
    public static void main(String[] args) {

        int [] scores={99,44,66,23,19,55};

        System.out.println(Arrays.toString(scores));
        System.out.println("original first item : "+ scores[0]);
        //for sorting array in ascending order
        //sort---->>>>> Arrays.sort(yourArrayHere)

        Arrays.sort(scores);
        //original order is changed with the above code!
        //original index is changed
        //first element is now 19 instead 99
        System.out.println(Arrays.toString(scores));
        System.out.println("sorted item value : "+scores[0]);

        System.out.println("---------character sorting------------");
        char[] nameChars={'G','A','d','Z','C','A'};
        System.out.println("Before sorting nameChars : "+Arrays.toString(nameChars));
        Arrays.sort(nameChars);
        System.out.println("After sorting nameChars : "+Arrays.toString(nameChars));


        System.out.println("---------string sorting------------");
        //ONLY FIRST CHARACTER IS MATTER WHEN WE SORT STRING ARRAY
        //IF THERE IS NUMBERS IN THE STRING ARRAY FIRST NUMBER WILL BE IMPORTANT TO SORT
        //"100" ,"9", "09" When we sort ,,,,>>> "09","100","9" is new order

        String superHeros[]={"Superman","Batman","Wonder Woman","Aquaman","Cyborg","Flash","100","9","08"};
        System.out.println("before sorting : "+Arrays.toString(superHeros));
        Arrays.sort(superHeros);
        System.out.println("after sorting : "+Arrays.toString(superHeros));

//*****************sort does not work for boolean array
boolean[] fiveSwitchOnOffs={true,false,false,true,true};
        System.out.println(Arrays.toString(fiveSwitchOnOffs));
        //we can not sort it because it is meaningless

    }
}
