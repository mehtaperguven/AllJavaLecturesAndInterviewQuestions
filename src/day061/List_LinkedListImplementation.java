package day061;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Interview Question
//What is the difference between ArrayList<> and LinkedList<>????

public class List_LinkedListImplementation {

    public static void main(String[] args) {


       // List<String > lst=new ArrayList<>();
        List<String > lst=new LinkedList<>();//
        //LinkedList like a person hold the hand of the next person
        //ArrayList implements differently when we insert, add item
        // it produces again new array with each elements
        //
        
        //if you have 4 elements in the lInkedList they are like holding hands of each other
        lst.add("Zeyneb");
        lst.add("Emir");
        lst.add("Didem");
        lst.add("Kudret");
        System.out.println("lst = " + lst);
        
        lst.remove("Emir");
        System.out.println("lst = " + lst);

        //If you have LInkedList it is backed by NODE
        // each member points to next  and previous element
        //New person should hold the hand of previous and next person's hand
        //In LinkedList is we add an item we do not produce new object
        //Just new item will hold last person's hand
        //if we want to put in the middle new item
        //Like a person, new element will hold previous and the next person's hand
//node is object as well
        //node has value and pointer in it. some times points two sides  some times one side
        //to add or remove we use this pointing idea
                //Therefore since we don't produce each time new array
        // Performance of LinkedList is better

        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


        //ArrayList<> is backed by Array in the back!!!!!
        //If we have array with the size of 4
        //In the back we have array with the same size holding all elements

        //inside LinkedList<> item 90 does not know item 100
        //To get item in LinkedList<>,the way is  asking one by one till to find correct place
        //GETTING RANDOM ITEM  BY INDEX ArrayList is better
        //TO ADD OR REMOVE THE ITEMS LinkedList is better


        //what is the BIG O ??????????
        //Way to describe how ArrayList vs LinkedList performs??
//O(1) means if you have more elements in the list, it does not change the performance
//O(N) means   N represents number of elements for the LinkedList
// if we have more item to find it will take more time


    }
}
