package day025;

import java.util.Arrays;

public class CheckArrayIsSortedOrNot {
    public static void main(String[] args) {

        int [] nums={13,31,8,21,2};
        int numsItemCount=nums.length;
        //I want to copy the content of nums
        int  [] numsCopy= new int[numsItemCount];
        System.out.println(Arrays.toString(numsCopy));
        numsCopy[0]=nums[0];
        numsCopy[1]=nums[1];
        numsCopy[2]=nums[2];
        numsCopy[3]=nums[3];
        numsCopy[4]=nums[4];
        System.out.println(Arrays.toString(numsCopy));
        System.out.println(Arrays.toString(nums));

for (int x=0; x<numsItemCount;x++){
    numsCopy[x]=nums[x];
}
        System.out.println("Before sorting numsCopy is= "+Arrays.toString(numsCopy));

Arrays.sort(numsCopy);
        System.out.println("After sorting numsCopy is= "+ Arrays.toString(numsCopy));
        System.out.println("nums "+ Arrays.toString(nums));
        System.out.println("numsCopy "+Arrays.toString(numsCopy));
        if (Arrays.equals(nums,numsCopy)){
            System.out.println("This array is not sorted");
        }else{
            System.out.println("This array is already sorted");
        }

    }
}
