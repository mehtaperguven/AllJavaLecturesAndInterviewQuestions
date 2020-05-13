package day027;

import java.util.Arrays;

public class MultiDimensionalArrays_3D {
    public static void main(String[] args) {

        int [][] arr2D={{1,2,3},{4,5,6}};
//                             0      1              0        1
        int [][][] arr3D={ {{1,2,3},{4,5,6}},   {{7,8,9},{10,11,12}}};
            //                    0                       1
        System.out.println(arr3D[1][0][2]);
        System.out.println(arr3D[0][0][1]);
        System.out.println(Arrays.toString(arr3D[0][0]));
        System.out.println(Arrays.toString(arr3D[1][0]));
        System.out.println(Arrays.deepToString(arr3D[1]));
        System.out.println(Arrays.deepToString(arr3D[0]));
    }
}
