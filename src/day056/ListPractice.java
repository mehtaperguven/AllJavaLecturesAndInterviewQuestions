package day056;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {
//all wrapper Classes has its own overriden equals() method
        List<Integer> nums=new ArrayList<>();
        nums.add(1);
        nums.add(10);
        nums.add(11);
        nums.add(10);
        nums.add(20);
        nums.add(22);
        nums.add(13);
        nums.add(80);

        System.out.println("nums = "+nums);
        System.out.println("nums.contains(10) = "+nums.contains(10));
        System.out.println(nums.get(1)==nums.get(3));

    }
}
