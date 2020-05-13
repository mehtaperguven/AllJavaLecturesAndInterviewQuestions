package day027;

import java.util.Arrays;

public class MultiDimensionalArrays_Practice {
    public static void main(String[] args) {
//                             0       1         0      1
        String [][] names={{"Cabir","Erva"},{"Feyza","Emir"}};
        //                         0                1
        System.out.println(Arrays.toString(names[1]));//------>> gives {Feyza,Emir}
        System.out.println(names[1][0]);//.........>>returns Feyza
        System.out.println(names[1][1]);// prints....>>Emir
        System.out.println(Arrays.toString(names[0]));//....>>>>{Cabir,Erva}
        System.out.println(Arrays.deepToString(names));
        //                   0,     1,       2,          3
        int [][] numbers={{1,2,3},{4,5,6},{7,8,9},{10,11,12,13}};

        for (int i=0;i<numbers.length;i++){
           for (int j=0; j<numbers[i].length;j++){
               System.out.print(numbers[i][j]+" ");
           }
        }
        System.out.println();
//print even numbers
        int [][] ages={{10},{12,13,14,16,17},{19,20,21,22,23}};
        System.out.println("even numbers are: ");
        for (int i=0;i<ages.length;i++){

            for (int j=0;j<ages[i].length;j++){
                if (ages[i][j]%2==0){

                    System.out.print(ages[i][j] + " ");
                }
            }
        }
        System.out.println("\n==========================");
        int [] arr1D={1,2,3};
        for (int each:arr1D){
            System.out.print(each+" ");
        }
        System.out.println("\n==========================");
        int [][]arr2D={{10,20,30},{40,50,60,70,80,90,100}};

        for (int[] each1DElement: arr2D){
            for (int each:each1DElement){

                System.out.print(each+" ");
            }
            System.out.println();
        }

    }
}
