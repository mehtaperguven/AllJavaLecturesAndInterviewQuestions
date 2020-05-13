package day062;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CollectionFrameWork {

    public static void main(String[] args) {
        //List, Set, Queue, are interface like we said Contract
        //There is no usage of index
        //Set is a data structure to store unique elements!!!!!!!!!

        //HashSet implements Set interface and always default choice
        //HashSet does not keep insertion order!!!!!
        //HashSet<Integer> myNums=new HashSet<>();
        Set<Integer> myNums=new HashSet<>(Arrays.asList(5,9));//polymorphism
       // HashSet<Integer> myNums=new HashSet<>(Arrays.asList(5,9));


        myNums.add(100);
        myNums.add(10);
        myNums.add(10);
        myNums.add(10);
        myNums.add(10);
        myNums.add(13);
        myNums.add(30);
        myNums.add(10);
        myNums.add(9);
        //System.out.println();
        System.out.println("myNums = " + myNums);
        //when we print above code Set does not care about index
        // it does not print with respect to order of entry....
        //
       // myNums =[9,10,13,30]

    }
}
