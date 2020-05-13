package day062;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetINtro {
    public static void main(String[] args) {

        //treeSet<<<<SortedSet<<<<<Set interfaces
//SortedSet interface extends Set interface
        //It is data structure that store unique elements in sorted order//natural order//ascending order//
        SortedSet<Integer> mySet=new TreeSet<>();//PUTS MIN ONE AS FIRST ELEMENT WHEN WE PRINT

        mySet.add(70);
        mySet.add(70);
        mySet.add(30);
        mySet.add(30);
        mySet.add(65);
        mySet.add(35);
        System.out.println("mySet = " + mySet);

        System.out.println("mySet.first() gives minimum element which is "+mySet.first()+" only in SortedSet");

        System.out.println("mySet.last() gives maximum element which is "+mySet.last()+" only in SortedSet");

    }
}
