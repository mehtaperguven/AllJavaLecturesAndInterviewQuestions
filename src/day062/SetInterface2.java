package day062;

import java.util.*;

public class SetInterface2 {
    public static void main(String[] args) {
//DO NOT FORGET IN HASHSET THERE IS NO DEFINED ORDER!!!!!
        //OUTPUT CAN BE ANY ORDER
        //We want to prepare HashSet with already given,ready items
        List<Integer> numList= Arrays.asList(10,10,30,90,78,78,90,30);
        System.out.println("numList = " + numList);

        Set<Integer> myNums=new HashSet<>(numList);
        System.out.println("myNums = " + myNums);
        //Collections.sort(myNums); Does not work

//

        //
    }
}
