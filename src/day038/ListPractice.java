package day038;

import java.util.ArrayList;
import java.util.Arrays;

public class ListPractice {
    public static void main(String[] args) {
        //how we copy everything from array into ArrayList object
        int [] nums =new int[]{1,4,5,7,8,5,3,2,19};
        System.out.println(Arrays.toString(nums));

        ArrayList<Integer> numlst=new ArrayList<>(Arrays.asList(1,4,5,7,8,5,3,2,19));

        System.out.println(numlst);

    }
}
