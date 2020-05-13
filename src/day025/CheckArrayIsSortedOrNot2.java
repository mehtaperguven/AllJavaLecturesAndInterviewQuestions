package day025;


import java.util.Arrays;

public class CheckArrayIsSortedOrNot2 {
    public static void main(String[] args) {

        //int [] nums={1,2,3,4,5,6};
        int [] nums={13,31,8,5,21,2};
        boolean isSortedAlready=true;
        System.out.println("nums = "+ Arrays.toString(nums));

        for (int x=0;x<nums.length-1;x++){

            System.out.println("is "+ nums[x]+" is less than "+nums[x+1]+" ? "+ (nums[x]<nums[x+1]));

            if (!(nums[x]<nums[x+1])){
                System.out.println("Array is not sorted ");
                isSortedAlready=false;
break;
            }

        }
        System.out.println("isSortedAlready = " + isSortedAlready);
    }

   

}
