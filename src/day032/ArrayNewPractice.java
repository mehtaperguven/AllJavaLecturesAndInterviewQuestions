package day032;

import java.util.Arrays;

public class ArrayNewPractice {
    public static void main(String[] args) {
        printArrayItems(new int []{1,6,8,9});//it passes directly into the method
        int [] scores={5,7,9,7,5,4};//here it is assigned first into a variable
        //then assigned into method
        printArrayItems(scores);
        printMaxOfIntArray(new int[]{5,9,6,4,9});
        printMinOfIntArray(new int[]{8,4,90,2,-2});
        sumOfTheArray(new int[]{2,6,3,8,-8});
        passedIfMoreThan60(new int[]{50,80,90,65});
        findSecondMax(new int[]{13,6,9,25});
        compare2arraySize(new String []{"Selam","Gulnur","Dilara"},new String []{"Erva"});
        String names1[]={"Superman","Hero"};
        String names2[]={"Aquaman","Cyborg","Voltran"};
        compare2arraySize(names1,names2);
    }
    //Perform a method which has an int array as a parameter
    //print array in this format
    //arrays has items :.....
    public static void printArrayItems(int [] nums){
        System.out.println("arrays has the following items : "+ Arrays.toString(nums));
    }
    public static void printMaxOfIntArray(int [] array){
        int max=array[0];
        for (int i=0;i<array.length;i++){
            if (max<array[i]){
                max=array[i];
            }
        }
        System.out.println("Maximum is : "+max);
    }
    public static void printMinOfIntArray(int [] array1){
        int min=array1[0];
        for (int i=0;i<array1.length;i++){
            if (min>array1[i]){
                min=array1[i];
            }
        }
        System.out.println("min number is  : "+min);
    }

    public static void sumOfTheArray(int []arraySum){
        int sum=0;
        for (int i=0;i<arraySum.length;i++){

            sum=sum+arraySum[i];
        }
        System.out.println("Sum of the Array is : "+sum);
    }
    public static void passedIfMoreThan60(int []array){
        for (int i=0;i<array.length;i++){
            if (array[i]>=60){
                System.out.println("Your score is "+array[i]+" you passed");
            }else{
                System.out.println("Your score is "+array[i]+" you failed");
            }

        }
    }
    public static void findSecondMax(int [] array){
        int max=array[0];
        for (int i=0;i<array.length;i++){
            if (max<array[i]){
                max=array[i];
            }
        }
        int secondMax=array[0];
        for (int i=0;i<array.length;i++){
            if (max==array[i]){
                continue;
            }
            if (secondMax<array[i]){
                secondMax=array[i];
            }
        }
        System.out.println("Second maximum is : "+secondMax);
    }
    public static void compare2arraySize(String [] arr1,String [] arr2){

        if (arr1.length>arr2.length){
            System.out.println("Array 1 has more item ");
        }else if(arr1.length<arr2.length){
            System.out.println("Array 2 has more item ");
        }else{
            System.out.println("They have same count of elements");
        }

    }

}
