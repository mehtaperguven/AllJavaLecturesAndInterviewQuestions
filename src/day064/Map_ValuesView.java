package day064;

import java.util.*;

public class Map_ValuesView {
    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap=new HashMap<>();

        groceryPriceMap.put("Tomato",1.99);
        groceryPriceMap.put("Potato",2.99);
        groceryPriceMap.put("Grape",3.99);
        groceryPriceMap.put("Banana",1.99);
        groceryPriceMap.put("Apple",1.89);

        Collection<Double> allValues=groceryPriceMap.values();


        System.out.println("#########"+allValues);

        List<Double> allPrices= new LinkedList<>(allValues);
        System.out.println("****"+allPrices);
//we print only values below

        for (Double each:allValues){
            System.out.println(each);
        }

        allValues.remove(1.99);
        System.out.println("After removing first price from all Values = "+allValues);
        System.out.println("As we see next removing value affected Map = "+  groceryPriceMap);
    }
}
