package day036;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class FindingUniqueUsingArrayList {
    public static void main(String[] args) {

        int [] nums={11,33,44,11,33,44,22,22,55,44,33};
        System.out.println(Arrays.toString(nums));
        ArrayList<Integer> uniqueLst=new ArrayList<>();
        System.out.println(uniqueLst);
        //Let us add items to uniqueLst if it does not already contains that item
       // for (int each:nums){
           // System.out.println("each = "+each);
          //  uniqueLst.add(each);
       // }
        //System.out.println(uniqueLst);

        //we printed only once in the uniqueLst ,elements of the each
        for (int each:nums){

            if (!uniqueLst.contains(each)){

                uniqueLst.add(each);
            }
        }
        System.out.println(uniqueLst);

    }

}
