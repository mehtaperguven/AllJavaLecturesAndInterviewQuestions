import java.util.Arrays;

public class CollectionFrameWork {

    /*Array lowest level data structure
    size fixed, size can not be change
    *can store both object and primitives
    * we can use length to get its size
    * we can not print directly */

    /*
    * Collection Framework
    * Interfaces:Iterable==>>Collection==>>(List,Set,Queue)===>>they store unique elements
    *                                       MAP==>>Stores Key-value pairssss
    *
    * Implementations==>>>
    * List==ArrayList, LinkedList
    * *****List ---> Ordered(indexed) Collection, may contain duplicate
    *
    *
    * Set==>HashSet, LinkedHashSet
    *    SortedSet==>TreeSet
    *
    *****Store unique value, no duplication
    * DIFFERENCE BETWEEN THEM:::
    *
    * ##HashSet==just keep it unique, no insertion order, no index
    *
    * ##LinkedHashSet==unique and insertion order
    *
    * ##TreeSet== unique and natural order
    *
    *  Queue==>ArrayDeque,PriorityQueue
    *
    * FIFO:First in first out
    * LIFO:Last in first out
    * Map==>HashMap,LinkedHashMap,HashTable
    *
    * Map==Key-value pair
    * Key is always unique-no duplication in keys
    *
    * INTERVIEW QUESTION:What is unique in the HashSet??
    * It is easy for Numbers and String
    * For custom types we override hashcode and equals method from Object class
    *
    * DO NOT FORGET COLLECTION IS FRAMEWORK*/

    public static void main(String[] args) {

        int [] arr={1,2,3,4};
        int length=arr.length;
        System.out.println(length);
        System.out.println(Arrays.toString(arr));



    }


}
