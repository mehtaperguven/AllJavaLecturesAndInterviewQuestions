package day038;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionReverse {
    public static void main(String[] args) {

        List<Integer> nums=new ArrayList<>(Arrays.asList(200,100,500,300));
        Collections.reverse(nums);//it gives the reverse order of the list without sorting
        System.out.println(nums);

        Collections.sort(nums,Collections.reverseOrder());
        System.out.println(nums);
    }
}
