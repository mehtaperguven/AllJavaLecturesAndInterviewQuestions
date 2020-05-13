package day064;

import java.util.HashMap;
import java.util.Map;

public class IteratingOverMapUsingLamda {
    public static void main(String[] args) {

        Map<String,Double> groceryPriceMap=new HashMap<>();
        groceryPriceMap.put("Tomato",1.99);
        groceryPriceMap.put("Potato",2.99);
        groceryPriceMap.put("Grape",3.99);
        groceryPriceMap.put("Banana",1.99);
        groceryPriceMap.put("Apple",1.89);
        System.out.println("LAMBDA EXPRESSION ");
        groceryPriceMap.forEach((name,price)-> System.out.println("name "+name+", Price "+price));

    }
}
