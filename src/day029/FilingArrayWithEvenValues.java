package day029;

import java.util.Arrays;

public class FilingArrayWithEvenValues {
    public static void main(String[] args) {
//print even numbers
        int [] numbers=new int[100];

        //numbers[0]=0;
        //numbers[1]=2;
        //numbers[2]=4;
        //......
        //numbers[99]=198;

        for (int i=0;i<numbers.length;i++){

            numbers[i]=2*i;
        }
        System.out.println("After filing up the array \n "+Arrays.toString(numbers));






    }
}
