package day064;

import java.util.SortedMap;
import java.util.TreeMap;
import java.util.*;

public class SortedMap_Practice {
    public static void main(String[] args) {
//TreeMap<> helps to sort by NATURAL ORDER of the key data type
        //It is implementation class
        //SortedMap extends Map
        SortedMap<String,Double> unitPricePair=new TreeMap<>();
        unitPricePair.put("Banana",0.5);
        unitPricePair.put("Orange",2.5);
        unitPricePair.put("Spinach",2.4);
        unitPricePair.put("Cheese",4.9);
        unitPricePair.put("Milk",2.3);
        unitPricePair.put("Spinach",2.4);
        unitPricePair.put("Carrot",2.5);
        System.out.println("unitPricePair "+unitPricePair);

//unitPricePair {Banana=0.5, Carrot=2.5, Cheese=4.9, Milk=2.3, Orange=2.5, Spinach=2.4}
 //Banana comes before Carrot in alphabet!!!

        //INTERVIEW QUESTION
       // What is the difference between HashMap and HasSet???
//HashSet is implementation of Set interface
// Store unique elements
// HashMap is implementation of Map interface
// HashMap stores  key-value pair>>>>> keys are unique
// They are two different data structure

        //DIFFERENCE BETWEEN HASHMAP, LINKEDHASHMAP, TREEMAP???
        //HashMap default implementation:faster, no insertion order, no sorted
        //LinkedHashMap extends HashMap: slightly slower, keeps insertion order
        //TreeMap is SortedMap implementation: slowest, keeps natural order



    }

}
