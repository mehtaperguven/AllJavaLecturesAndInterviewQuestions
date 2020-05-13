package day038;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListObjectEqualityCheck {
    public static void main(String[] args) {

        List<Integer> nums1 = new ArrayList<>(Arrays.asList(200,300,600,700,800));
        List<Integer> nums2 = new ArrayList<>(Arrays.asList(200,300,600,700,800));
        List<Integer> nums3 = new ArrayList<>(Arrays.asList(800,200,600,700,300));
        System.out.println(nums1.equals(nums2));//TRUE
        System.out.println(nums3.equals(nums1));//FALSE

    }
}
