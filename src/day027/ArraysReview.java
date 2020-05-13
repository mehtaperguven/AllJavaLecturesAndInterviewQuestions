package day027;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysReview {
    public static void main(String[] args) {

        int num=10;
        int arr[]={10,20,30,40,50,60};
        int numLast=arr[arr.length-1];
        System.out.println(numLast);
        for (int x=0;x<arr.length;x++){
            System.out.print(arr[x]+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));

        //Task01
        //Ask user enter 5 numbers
       // store them into an array

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an int number: ");

        int[]numbers=new int [5];
        for (int i=0;i<5;i++){
            numbers[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
//we finished the task above
//Find the largest number
        int largest= numbers[0];
        for (int i=1;i<numbers.length;i++){

            if (largest<numbers[i]){
                largest=numbers[i];
            }
        }
        System.out.println("Largest number is: "+largest);


        int min=numbers[0];
        for (int i=1;i<numbers.length;i++){

            if (min>numbers[i]){
                min=numbers[i];
            }
        }
        System.out.println("Minimum number is: "+min);
        System.out.println();
        //finding second minimum

        int secondMin=numbers[0];
        for(int i=0;i<numbers.length;i++){


             if (secondMin>numbers[i]&& numbers[i]!=min){
                           secondMin=numbers[i];
                       }

        }
        System.out.println("Second minimum number is: "+secondMin);
        //finding third min number
        int thirdMin=numbers[0];
        for(int i=0;i<numbers.length;i++){


            if (thirdMin>numbers[i] && numbers[i]!=min && numbers[i]!=secondMin){
                thirdMin=numbers[i];
            }

        }
        System.out.println(thirdMin);

    }
}
