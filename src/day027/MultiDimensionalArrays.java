package day027;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        //N dimensional array contains n-1 dimensional arrays
        //2 dimensional array contains 1 dimensional arrays
        int [] arr1D={1,2,3};
        int [][] arr2D={{1,2,3},{4,5,6}};
        // index:           0      1
        System.out.println("members of arr2D : "+arr2D.length);//2

        System.out.println(Arrays.toString(arr2D[0]));//{1,2,3}
        System.out.println(Arrays.toString(arr2D[1]));//{4,5,6}

        System.out.println(arr2D[0][2]);//gives 3
        System.out.println(arr2D[1][1]);// gives 5
        System.out.println(Arrays.toString(arr2D[1]));
//Arrays.deepToString() METHOD RETURNS ALL MEMBERS OF ARRAY AS A STRING
        System.out.println(Arrays.deepToString(arr2D));





    }
}
