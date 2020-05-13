package day061;

import java.util.*;

public class CollectionContinue {

    public static void main(String[] args) {


        Collection<Integer> nums=new ArrayList<>();//I have
        nums.addAll(Arrays.asList(1,6,4,5,7,8));
        System.out.println("nums = " + nums);
       // Collections.sort(nums);//It requires list of Integer
        //However nums is list of Collection type


        //Question:can we use get method when we have Collection as reference type?
        //no!! only reference type decide what we can access
        //Collections has not get() method
        //Collections has sort() method

        List<Integer>nums2=new ArrayList<>(Arrays.asList(10,7,4,11,67,8));
        Collections.sort(nums2);
        System.out.println("nums2 = " + nums2);
        
    }
}
