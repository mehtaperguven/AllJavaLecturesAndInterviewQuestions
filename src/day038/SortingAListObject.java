package day038;

import java.util.*;

public class SortingAListObject {
    public static void main(String[] args) {

        List<Integer> nums=new ArrayList<>(Arrays.asList(300,200,700,600,800));
        System.out.println("Before sort = "+nums);

        //2 ways to sort arrayList
        //use Collections utility class (Like Arrays utility)
        //Collections is a Class coming from java.util package
        //Collections has a lot of methods like ArrayList, Arrays, etc.
//way1
        Collections.sort(nums);//from low to high
        System.out.println("After sort = " + nums);

        //Comparator.reverseOrder() it sorts in reverse order
        Collections.sort(nums,Comparator.reverseOrder());
        System.out.println(nums);
        //List itself also has sort method that accept Comparator object
        //Comparator.naturalOrder()...>>>>from low to high order
        //Comparator.reverseOrder()...>>>>from low to high order
//way2
        nums.sort(Comparator.naturalOrder());
        System.out.println("After using Comparator.naturalOrder() "+nums );
        nums.sort(Comparator.reverseOrder());
        System.out.println("After using Comparator.reverseOrder() "+nums );
    }
}
