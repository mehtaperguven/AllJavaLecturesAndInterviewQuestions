package day027;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTerminology {
    public static void main(String[] args) {

        /*int [] arr={1,2,3}
        arr[1]=2;
        * N dimensional array contains N-1 dimensional arrays
        * int [][] arr2D={{1,2,3},{0,8,6,5}}
        * arr2D[0][0]=1
        * arr2D[1][2]=6
        * arr2D[0]={1,2,3}
        * arr2D[1]={0,8,6,5}
        Array 2 Ways

        int [][] arr2D={{1,2},{4,5,6}};
        int [][] arr2D=new int[][]{{1,2},{4,5,6}}
        int[][] arr2D= new int[2][3];


        Ex: 3D array contains 2D arrays

        Length of the 3D array is determined by the numbers of 2D array

         */
        int[][] arr2D= new int[2][3];
        System.out.println(Arrays.deepToString(arr2D));
    //indexes are represented below
        //                   0  1  2   0 1 2       0  1     0
    //                          0        1           0     1
        int [][][] array3D={{{1,2,3}, {4,5,6}}  , {{7,8},{9}}};
//                                  0                   1
        System.out.println(Arrays.toString(array3D[1][0]));
        System.out.println(array3D[0][0][2]);
    }
}
