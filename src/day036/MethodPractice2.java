package day036;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MethodPractice2 {
    public static void main(String[] args) {
long nums[]={4L,8L,9L,2L,90L};
        System.out.println("Before swapping "+Arrays.toString(nums));
        swapFirstAndLastValue(nums);

       long [] myNums1=new long[5];
        System.out.println("Arrays.toString(myNums1) = " + Arrays.toString(myNums1));
       Long []myNums2=new Long[5];
        System.out.println("Arrays.toString(myNums2) = " + Arrays.toString(myNums2));
String str="abc";
        System.out.println("str = " + str);
String str2=null;// no address
        System.out.println("str2 = " + str2);
        String stt="";
        System.out.println("stt = " + stt);



    }public static void swapFirstAndLastValue(long [] nums){

        long temp=nums[0];
        nums[0]=nums[nums.length-1];
        nums[nums.length-1]=temp;
        System.out.println("After swapping   "+Arrays.toString(nums));
    }
}
