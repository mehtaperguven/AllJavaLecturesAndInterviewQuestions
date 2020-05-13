package day024;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysEquality {
    public static void main(String[] args) {
        int scores1 []={2,5,6,7,3,34,6};
        int scores2 []={22,45,6,37,3,6,9};
        int scores3 []={2,5,6,7,3,34,6};
        int scores4 []={2,34,6,6,3,5,7};
        System.out.println(scores1==scores2);
        System.out.println(scores1==scores3);
        //both codes will give false !!!!!

        boolean isS1S2Equals= Arrays.equals(scores1,scores2);
        System.out.println("Does score1 is equal to score2 "+isS1S2Equals);
        boolean isS1S3Equals=Arrays.equals(scores1,scores3);
        System.out.println("Does score1 is equal to score3 "+isS1S3Equals);
        boolean isS3S4Equals=Arrays.equals(scores3,scores4);
        System.out.println("Does score3 is equal to score4 "+isS3S4Equals);


        Arrays.sort(scores3);
        Arrays.sort(scores4);
        System.out.println("sorting  arrays and after  comparing their equality gives:");
        System.out.println(Arrays.equals(scores3,scores4));

    }
}
