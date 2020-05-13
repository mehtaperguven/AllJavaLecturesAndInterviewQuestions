package day029;

import java.util.Arrays;

public class FillingUpArrayValue {
    public static void main(String[] args) {
        //perform an array that has size of 100
        //numbers are from 1 till 100
        int [] numbers=new int[100];
        System.out.println("Before assigning numbers: "+Arrays.toString(numbers));
        numbers[0]=1;
        numbers[1]=2;
        numbers[2]=3;
        //...............
        numbers[99]=100;
        System.out.println(Arrays.toString(numbers));
//we do it by loop !!
        for (int i=0;i<numbers.length;i++){
            numbers[i]=i+1;
        }
        System.out.println("After assigning numbers: "+Arrays.toString(numbers));

        System.out.println("===============");
        int [][] newDimensions=new int [100][100];
        for (int i=0;i<100;i++){
        for (int j=0;j<100;j++){
            newDimensions[i][j]=j+1;
        }
           // System.out.println(Arrays.deepToString(newDimensions));

    }
        System.out.println(newDimensions[99][99]);
        System.out.println(Arrays.toString(newDimensions[99]));


    }
}
