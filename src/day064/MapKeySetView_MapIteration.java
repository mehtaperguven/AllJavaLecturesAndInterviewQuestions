package day064;

import java.util.*;

public class MapKeySetView_MapIteration {

    public static void main(String[] args) {


        //Map is NOT ITERABLE we can not directly iterate over them
        //We can get something iterable out of the Map
        //for example keySet view will return a Set<String> and it's iterable


        Map<String, Double> groceryPriceMap=new HashMap<>();

        groceryPriceMap.put("Tomato",1.99);
        groceryPriceMap.put("Potato",2.99);
        groceryPriceMap.put("Grape",3.99);
        groceryPriceMap.put("Banana",1.99);
        groceryPriceMap.put("Apple",1.89);

        Set<String> allNames=groceryPriceMap.keySet();



        List<Double> allValues=new LinkedList<>();
        for (String eachName:allNames){

           // System.out.println("Each Name = "+eachName);
            System.out.println("Value is = "+groceryPriceMap.get(eachName));
            allValues.add(groceryPriceMap.get(eachName));

        }
        System.out.println(allValues);
    }
}
