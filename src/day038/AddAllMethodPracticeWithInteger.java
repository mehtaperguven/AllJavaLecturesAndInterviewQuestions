package day038;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddAllMethodPracticeWithInteger {
    public static void main(String[] args) {


        ArrayList<Integer> nums1=new ArrayList<>();
        nums1.add(123);
        nums1.add(100);
        nums1.add(223);
        nums1.add(133);
        nums1.add(125);
        nums1.add(122);

        ArrayList<Integer> nums2=new ArrayList<>();
        nums2.add(900);
        nums2.add(890);


        nums1.addAll(nums2);
        System.out.println(nums1);

        List<Integer> addFourItems= Arrays.asList(5,7,8,9);
        nums2.addAll(addFourItems);
        System.out.println(nums2);
        ///simply
        nums2.addAll(Arrays.asList(90,75));//we perform Arrays.asList() to return a List  object
        System.out.println(nums2);
    }
}
