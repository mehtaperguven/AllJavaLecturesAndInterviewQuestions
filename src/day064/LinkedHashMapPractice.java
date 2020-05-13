package day064;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapPractice {
    public static void main(String[] args) {
Map<String,Double> unitPricePair=new LinkedHashMap<>();

//we used LinkedHashMap<>  to keep insertion order
        //if we use HashMap<> no order!!!!!
        unitPricePair.put("Banana",0.5);
        unitPricePair.put("Orange",2.5);
        unitPricePair.put("Spinach",2.4);
        unitPricePair.put("Cheese",4.9);
        unitPricePair.put("Milk",2.3);
        unitPricePair.put("Spinach",2.4);
        unitPricePair.put("Carrot",2.5);
        System.out.println("unitPricePair "+unitPricePair);

        //unitPricePair {Banana=0.5, Orange=2.5, Spinach=2.4, Cheese=4.9, Milk=2.3, Carrot=2.5}
    }
}
