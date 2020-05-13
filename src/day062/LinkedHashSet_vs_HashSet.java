package day062;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet_vs_HashSet {
    public static void main(String[] args) {
//if we have Set===NO DUPLICATION!!!
        // primary difference between HashSet and LinkedHashSet is LinkedHashSet keep insertion order
        // HashSet is always way faster since it has less responsibility
//HashSet does not keep insertion order
        //TreeSet==if we want to keep sorting order
       //
        //
        //
        //
        //
        // Set<Integer> myNums=new HashSet<>(Arrays.asList(5,9));//polymorphism
        Set<Integer> myNums= new LinkedHashSet<>();//INSERTION ORDER IS IMPORTANT//FIRST PRINTED FIRST//FIRST IN FIRST OUT
        //LinkedHashSet gives in order with respect to entry order
        // when we print elements.......[10, 7, 9, 22]
        myNums.add(10);
        myNums.add(7);
        myNums.add(10);
        myNums.add(9);
        myNums.add(10);
        myNums.add(22);
        myNums.add(7);

        System.out.println("myNums LinkedHashSet "+myNums);

        Set<Integer> myNums2=new HashSet<>();//DOES NOT KEEP ENTRY ORDER
        myNums2.add(10);
        myNums2.add(7);
        myNums2.add(10);
        myNums2.add(9);
        myNums2.add(10);
        myNums2.add(22);
        myNums2.add(7);
        System.out.println("myNums HashSet "+myNums2);//....[22, 7, 9, 10]

    }
}
