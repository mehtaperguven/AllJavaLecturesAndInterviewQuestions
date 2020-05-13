package day036;

import  java.util.Arrays;

public class MethodWithParameterArray {
    public static void main(String[] args) {
        int nums[]={1,5,3,4,7,2};
        System.out.println("Before sorting nums array = "+ Arrays.toString(nums));
    Arrays.sort(nums);
        System.out.println("After sorting nums array = "+Arrays.toString(nums));

        changeFirstItemInto100(nums);
        System.out.println("Changing first array value = "+Arrays.toString(nums));


    }public static void changeFirstItemInto100(int []nums){

        nums[0]=100;
    }
}
